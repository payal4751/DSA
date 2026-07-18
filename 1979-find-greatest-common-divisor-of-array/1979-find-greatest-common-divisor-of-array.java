class Solution {
    public int findGCD(int[] nums) {
        int mn=Integer.MAX_VALUE;
        int mx=Integer.MIN_VALUE;

        for(int num : nums){
            mn=Math.min(mn,num);
            mx=Math.max(mx,num);
        }

        for(int i=mn;i>0;i--){
            if(mn % i==0 && mx % i==0){
                return i;
            }
        }

        return 1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna