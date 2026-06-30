class Solution {
    public int[] sortArrayByParityII(int[] nums) {

        int[] ans = new int[nums.length];

        int evenIndex = 0;
        int oddIndex = 1;

        for (int num : nums) {

            if (num % 2 == 0) {
                ans[evenIndex] = num;
                evenIndex += 2;
            } else {
                ans[oddIndex] = num;
                oddIndex += 2;
            }
        }

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna