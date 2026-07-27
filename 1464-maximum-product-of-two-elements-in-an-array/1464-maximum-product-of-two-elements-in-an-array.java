class Solution {
    public int maxProduct(int[] nums) {
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            if(nums[i]>=max1){
                max2=max1;
                max1=nums[i];
            } else if(nums[i]>max2){
                max2=nums[i];
            }
        }
       
        // Correct! Your approach efficiently finds the two largest elements in a single pass.
        // Time Complexity: O(n) - where n is the length of the array.
        // Space Complexity: O(1) - as you only use two integer variables.
        // This is the optimal complexity for this problem.
        // Feel free to submit your solution!
        return (max1 - 1) * (max2 - 1);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna