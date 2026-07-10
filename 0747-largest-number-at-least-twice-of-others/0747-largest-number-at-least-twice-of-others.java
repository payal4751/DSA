class Solution {
    public int dominantIndex(int[] nums) {
        int max1 = -1;
        int max_idx = -1;
        int max2=-1;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max1) {
                max2=max1;
                max1 = nums[i];
                max_idx = i;
            }else if (nums[i] > max2) {
                max2 = nums[i];
            }
        }
        
        return max1>=2*max2 ? max_idx : -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna