import java.util.*;

class Solution {

    static class Pair {
        int city;
        int dist;

        Pair(int city, int dist) {
            this.city = city;
            this.dist = dist;
        }
    }

    int ans = Integer.MAX_VALUE;

    public int minScore(int n, int[][] roads) {

        List<List<Pair>> graph = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] road : roads) {
            graph.get(road[0]).add(new Pair(road[1], road[2]));
            graph.get(road[1]).add(new Pair(road[0], road[2]));
        }

        boolean[] visited = new boolean[n + 1];

        dfs(1, graph, visited);

        return ans;
    }

    private void dfs(int city, List<List<Pair>> graph, boolean[] visited) {

        visited[city] = true;

        for (Pair next : graph.get(city)) {

            ans = Math.min(ans, next.dist);

            if (!visited[next.city]) {
                dfs(next.city, graph, visited);
            }
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna