class Solution {
    public int[] pathsWithMaxScore(List<String> board) {
        int n = board.size();
        int MOD = 1_000_000_007;

        int[][] score = new int[n][n];
        int[][] ways = new int[n][n];

        // -1 means unreachable
        for (int i = 0; i < n; i++) {
            Arrays.fill(score[i], -1);
        }

        score[n - 1][n - 1] = 0;
        ways[n - 1][n - 1] = 1;

        for (int i = n - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {

                if (board.get(i).charAt(j) == 'X') continue;
                if (i == n - 1 && j == n - 1) continue;

                int best = -1;
                long cnt = 0;

                int[][] dirs = {
                    {i + 1, j},
                    {i, j + 1},
                    {i + 1, j + 1}
                };

                for (int[] d : dirs) {
                    int x = d[0], y = d[1];

                    if (x >= n || y >= n) continue;
                    if (score[x][y] == -1) continue;

                    if (score[x][y] > best) {
                        best = score[x][y];
                        cnt = ways[x][y];
                    } else if (score[x][y] == best) {
                        cnt = (cnt + ways[x][y]) % MOD;
                    }
                }

                if (best == -1) continue;

                char ch = board.get(i).charAt(j);
                int val = Character.isDigit(ch) ? ch - '0' : 0;

                score[i][j] = best + val;
                ways[i][j] = (int) (cnt % MOD);
            }
        }

        if (ways[0][0] == 0) return new int[]{0, 0};

        return new int[]{score[0][0], ways[0][0]};
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna