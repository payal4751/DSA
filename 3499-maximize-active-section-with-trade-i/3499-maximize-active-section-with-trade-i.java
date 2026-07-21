class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        int ones = 0;
        for (char c : s.toCharArray()) {
            if (c == '1') ones++;
        }

        String t = "1" + s + "1";
        int n = t.length();

        List<Integer> len = new ArrayList<>();
        List<Character> ch = new ArrayList<>();

        int i = 0;
        while (i < n) {
            char c = t.charAt(i);
            int j = i;
            while (j < n && t.charAt(j) == c) j++;

            ch.add(c);
            len.add(j - i);
            i = j;
        }

        int maxGain = 0;

        for (int k = 1; k + 1 < ch.size(); k++) {
            if (ch.get(k) == '1' &&
                ch.get(k - 1) == '0' &&
                ch.get(k + 1) == '0') {

                maxGain = Math.max(maxGain,
                                   len.get(k - 1) + len.get(k + 1));
            }
        }

        return ones + maxGain;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna