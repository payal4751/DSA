class Solution {
    public boolean isAnagram(String s, String t) {
        // Your current approach using sorting is correct!
        // Time Complexity: O(n log n) due to Arrays.sort()
        // Space Complexity: O(n) to store the character arrays
        
        if(s.length()!=t.length())   return false;
		
		char [] a=s.toCharArray();
		char [] b=t.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		// This is a valid solution. You can go ahead and submit!
		// OPTIMIZATION TIP: You can achieve O(n) time complexity using a frequency array (hash map) 
		// to count character occurrences instead of sorting.
		return Arrays.equals(a, b);
}
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna