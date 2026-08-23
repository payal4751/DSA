class Solution {
    public boolean sumGame(String num) {
        int n = num.length();
        int half = n / 2;

        int leftSum = 0, rightSum = 0;
        int leftQ = 0, rightQ = 0;

        for (int i = 0; i < half; i++) {
            char c = num.charAt(i);
            if (c == '?') leftQ++;
            else leftSum += c - '0';
        }

        for (int i = half; i < n; i++) {
            char c = num.charAt(i);
            if (c == '?') rightQ++;
            else rightSum += c - '0';
        }

        // Odd number of question marks -> Alice always wins
        if (((leftQ + rightQ) & 1) == 1) {
            return true;
        }

        int diff = leftSum - rightSum;

        // Bob wins only in this exact situation
        return 2 * diff != (rightQ - leftQ) * 9;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna