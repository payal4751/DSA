class Solution {
    public int[] gcdValues(int[] nums, long[] queries) {
        int max = 0;
        for (int x : nums) max = Math.max(max, x);

        int[] freq = new int[max + 1];
        for (int x : nums) freq[x]++;

        long[] cnt = new long[max + 1];

        // Count pairs whose gcd is exactly g
        for (int g = max; g >= 1; g--) {
            long c = 0;

            for (int multiple = g; multiple <= max; multiple += g) {
                c += freq[multiple];
            }

            cnt[g] = c * (c - 1) / 2;

            for (int multiple = 2 * g; multiple <= max; multiple += g) {
                cnt[g] -= cnt[multiple];
            }
        }

        // Prefix sum
        long[] prefix = new long[max + 1];
        for (int i = 1; i <= max; i++) {
            prefix[i] = prefix[i - 1] + cnt[i];
        }

        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            long q = queries[i] + 1;

            int lo = 1, hi = max;

            while (lo < hi) {
                int mid = (lo + hi) / 2;

                if (prefix[mid] >= q)
                    hi = mid;
                else
                    lo = mid + 1;
            }

            ans[i] = lo;
        }

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna