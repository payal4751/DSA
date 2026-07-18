class Solution {
    public int smallestEvenMultiple(int n) {
        for(int i=2;i<=2*n;i++){
            if(i%2==0 && i%n==0){
                return i;
            }
        }
        return 1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna