class Solution {
    public int maxProduct(int n) {
        int [] nums=new int [10];
        int k=0;
        while(n>0){
            int digit=n%10;
            nums[k++]=digit;
            n/=10;
        }
        int prod=0;
        for(int i=0;i<k;i++){
            for(int j=i+1;j<k;j++){
                 prod = Math.max(prod, nums[i] * nums[j]);
            }
        }
        return prod;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna