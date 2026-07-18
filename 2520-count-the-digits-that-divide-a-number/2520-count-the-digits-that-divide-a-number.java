class Solution {
    public int countDigits(int num) {
        int count =0;
        int org=num;
        while(num!=0){
            int digit=num%10;
            if(org%digit==0) count++;
            num/=10;
        }
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna