class Solution {
    public boolean isPalindrome(int x) {
        int org=x;
        if(x<0){
            return false;
        }
        int num=0;
        while(x>0){
            int digit=x%10;
            num=digit+num*10;
            x/=10;
        }
        return org==num;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna