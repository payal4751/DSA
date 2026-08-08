import java.util.*;

class Solution {

    public int[] validSequence(String word1, String word2) {

        int n = word1.length();
        int m = word2.length();

        int[] ans = new int[m];

        // last[j] = position in word1 used to match word2[j]
        // when matching the suffix from right to left.
        int[] last = new int[m];
        Arrays.fill(last, -1);

        // Build suffix information.
        int i = n - 1;
        int j = m - 1;

        while (i >= 0 && j >= 0) {

            if (word1.charAt(i) == word2.charAt(j)) {
                last[j] = i;
                j--;
            }

            i--;
        }

        // Greedily build the lexicographically smallest answer.
        boolean canSkip = true;

        j = 0;

        for (i = 0; i < n; i++) {

            if (j == m) {
                break;
            }

            // Case 1: Exact match
            if (word1.charAt(i) == word2.charAt(j)) {

                ans[j] = i;
                j++;

            }

            // Case 2: Use our one allowed mismatch
            else if (
                canSkip &&
                (j == m - 1 || i < last[j + 1])
            ) {

                ans[j] = i;
                j++;

                canSkip = false;
            }
        }

        // Couldn't construct the entire sequence.
        if (j != m) {
            return new int[0];
        }

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna