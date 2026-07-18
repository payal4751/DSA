class Solution {
    public int differenceOfSum(int[] nums) {
        int Esum=0;
        int Dsum=0;

        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            Esum+=num;
            while(num!=0){
                int digit=num%10;
                Dsum+=digit;
                num/=10;
            }
        }
        return Esum-Dsum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna