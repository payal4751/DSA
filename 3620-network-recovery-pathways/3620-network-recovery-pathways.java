class Solution {

    static class Edge {
        int to;
        int cost;

        Edge(int to, int cost) {
            this.to = to;
            this.cost = cost;
        }
    }

public int findMaxPathScore(int[][] edges, boolean[] online, long k){

        int n = online.length;

        List<List<Edge>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        int[] indegree = new int[n];
        int maxEdge = 0;

        for (int[] e : edges) {
            graph.get(e[0]).add(new Edge(e[1], e[2]));
            indegree[e[1]]++;
            maxEdge = Math.max(maxEdge, e[2]);
        }

        // Topological Order
        List<Integer> topo = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            if (indegree[i] == 0)
                q.offer(i);
        }

        while (!q.isEmpty()) {
            int u = q.poll();
            topo.add(u);

            for (Edge e : graph.get(u)) {
                indegree[e.to]--;
                if (indegree[e.to] == 0)
                    q.offer(e.to);
            }
        }

        int low = 0;
        int high = maxEdge;
        int ans = -1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (check(mid, graph, topo, online, k)) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }

    private boolean check(int minEdge,
                          List<List<Edge>> graph,
                          List<Integer> topo,
                          boolean[] online,
                          long k) {

        int n = online.length;

        long INF = Long.MAX_VALUE / 4;

        long[] dp = new long[n];
        Arrays.fill(dp, INF);

        dp[0] = 0;

        for (int u : topo) {

            if (dp[u] == INF)
                continue;

            if (u != 0 && u != n - 1 && !online[u])
                continue;

            for (Edge e : graph.get(u)) {

                if (e.cost < minEdge)
                    continue;

                int v = e.to;

                if (v != n - 1 && !online[v])
                    continue;

                dp[v] = Math.min(dp[v], dp[u] + e.cost);
            }
        }

        return dp[n - 1] <= k;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna