class Solution {

    int[][] memo;
    int[] suffix;
    int n;

    public int stoneGameII(int[] piles) {

        n = piles.length;

        suffix = new int[n + 1];

        // suffix[i] = total stones from i to n - 1
        for (int i = n - 1; i >= 0; i--) {
            suffix[i] = suffix[i + 1] + piles[i];
        }

        memo = new int[n][n + 1];

        for (int i = 0; i < n; i++) {
            java.util.Arrays.fill(memo[i], -1);
        }

        return solve(0, 1, piles);
    }

    private int solve(int i, int M, int[] piles) {

        // Can take all remaining piles
        if (i + 2 * M >= n) {
            return suffix[i];
        }

        if (memo[i][M] != -1) {
            return memo[i][M];
        }

        int best = 0;

        for (int x = 1; x <= 2 * M; x++) {

            int opponent = solve(
                i + x,
                Math.max(M, x),
                piles
            );

            int currentPlayer = suffix[i] - opponent;

            best = Math.max(best, currentPlayer);
        }

        return memo[i][M] = best;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna