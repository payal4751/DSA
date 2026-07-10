class Solution {
    public int pivotIndex(int[] nums) {
        int rightSum=0;
        int leftSum=0;

        for(int num:nums){
            rightSum+=num;
        }

        for(int i=0;i<nums.length;i++){
            if(leftSum==rightSum-nums[i]){
                return i;
            }
            rightSum-=nums[i];
            leftSum+=nums[i];
        }
return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna