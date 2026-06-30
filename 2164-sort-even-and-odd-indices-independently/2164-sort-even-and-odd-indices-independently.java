class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int [] ans=new int [nums.length];

        int j=0;
        int [] even=new int [(nums.length+1)/2];
        int k=0;
        int [] odd=new int [nums.length/2];

        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                even[j]=nums[i];
                j++;
            }
            else{
                odd[k]=nums[i];
                k++;
            }
        }
        Arrays.sort(even);
        Arrays.sort(odd);

        int l=0;
        int m=odd.length-1;
        for(int i=0;i<nums.length;i++){
             if (i%2 == 0) {
               ans[i]=even[l++];
             }
             else {
               ans[i]=odd[m--];
             }
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna