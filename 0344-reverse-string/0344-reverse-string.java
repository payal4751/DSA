class Solution {
    public void reverseString(char[] s) {
        int i=0;
        int j=s.length-1;
        while(i<=j){
                char temp=s[j];
                s[j--]=s[i];
                s[i++]=temp;
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna