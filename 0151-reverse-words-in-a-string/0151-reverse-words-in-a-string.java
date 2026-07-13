class Solution {
    public String reverseWords(String s) {
        String trimmedStr=s.trim();

        String []arr=trimmedStr.split("\\s+");

        List <String> list=Arrays.asList(arr);

        Collections.reverse(list);

        return String.join(" ",list);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna