class Solution {
    public int product(int n) {
        int prod = 1;
        while (n > 0) {
            int digit = n % 10;
            prod *= digit;
            n /= 10;
        }
        return prod;
    }

    public int smallestNumber(int n, int t) {
        while(true){
        int prod = product(n);
        if (prod % t == 0) {
            return n;
        } 

        n++;
        
        }
    }
}

 
        // Time Complexity: O(K * log10(N)), where K is the distance from n to the answer.
        // Space Complexity: O(1).

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna