class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length())   return false;

        // Coach: Your implementation is correct and handles all edge cases!
        // Time Complexity: O(n) - where n is the length of the strings. We traverse each string once.
        // Space Complexity: O(k) - where k is the number of unique characters. In worst case O(26) for lowercase English.
       
        HashMap<Character, Integer> map = new HashMap<>();

        // Count frequency of characters in s
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Decrease frequency using t
        for (char ch : t.toCharArray()) {

            if (!map.containsKey(ch)) {
                return false;
            }

            map.put(ch, map.get(ch) - 1);

            if (map.get(ch) == 0) {
                map.remove(ch);
            }
        }

        return map.isEmpty();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna