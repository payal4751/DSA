class Solution {
    public void moveZeroes(int[] nums) {
        int slow=0;
        int fast = 0;

    while (fast<nums.length) {

        if (nums[fast]!=0) {

            int temp = nums[fast];
            nums[fast] = nums[slow];
            nums[slow] = temp;
            slow++;
        }
            fast++;
    
    }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna