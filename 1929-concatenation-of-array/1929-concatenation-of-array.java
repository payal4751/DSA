class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int [] ans=new int [2*n];
        for(int i=0;i<nums.length;i++){
            // Your logic is correct! You are efficiently filling both halves of the array in one pass.
            // Time Complexity: O(n) - where n is the length of the input array.
            // Space Complexity: O(n) - to store the result array of size 2n.
            // This is the optimal complexity for this problem.
            ans[i]=nums[i];
            ans[i+n]=nums[i];
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna