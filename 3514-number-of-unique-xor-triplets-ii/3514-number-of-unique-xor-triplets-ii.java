class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int n = nums.length;

        // n < 3 : only repeated indices are possible
        if (n < 3) {
            HashSet<Integer> set = new HashSet<>();
            for (int x : nums) set.add(x);
            return set.size();
        }

        final int MAX = 2048;

        boolean[][] dp = new boolean[4][MAX];
        dp[0][0] = true;

        for (int v : nums) {
            for (int cnt = 2; cnt >= 0; cnt--) {
                for (int x = 0; x < MAX; x++) {
                    if (dp[cnt][x]) {
                        dp[cnt + 1][x ^ v] = true;
                    }
                }
            }
        }

        boolean[] ans = new boolean[MAX];

        // XOR of 3 distinct chosen values
        for (int x = 0; x < MAX; x++)
            if (dp[3][x])
                ans[x] = true;

        // a ^ a ^ a = a
        for (int v : nums)
            ans[v] = true;

        int res = 0;
        for (boolean b : ans)
            if (b) res++;

        return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna