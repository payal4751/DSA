class Solution {
    public int[] leftRightDifference(int[] nums) {
        int LSum=0;
        int RSum=0;

        int [] leftSum=new int [nums.length];
        int [] rightSum=new int [nums.length];
        int [] ans=new int [nums.length];

        for(int i=0;i<nums.length;i++){
            leftSum[i]=LSum;
            LSum+=nums[i];
        }

        for(int i=nums.length-1;i>=0;i--){
            rightSum[i]=RSum;
            RSum+=nums[i];
        }

        for(int i=0;i<nums.length;i++){
            ans[i]=Math.abs(leftSum[i]-rightSum[i]);
        }

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna