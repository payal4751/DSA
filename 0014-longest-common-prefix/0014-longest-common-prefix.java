class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0) return "";

        // Your implementation is correct and follows the Horizontal Scanning approach.
        // Time Complexity: O(S), where S is the sum of all characters in all strings.
        // Space Complexity: O(1), as we only use a constant amount of extra space for the prefix pointer.
        // This is the optimal time complexity for this problem.
        
        String prefix=strs[0];

        for(int i=1;i<strs.length;i++){
            while(strs[i].indexOf(prefix) != 0){
                prefix=prefix.substring(0,prefix.length()-1);

                if(prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna