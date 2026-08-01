class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int num:nums1){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        ArrayList<Integer> list = new ArrayList<>();

        for (int num : nums2) {

            if (map.getOrDefault(num, 0) > 0) {
                list.add(num);
                map.put(num, map.get(num) - 1);
            }
        }
        int[] ans = new int[list.size()];

        for (int i = 0; i < list.size(); i++)
            ans[i] = list.get(i);

        // COMPLEXITY ANALYSIS:
        // Time Complexity: O(n + m) where n and m are lengths of the two arrays.
        // Space Complexity: O(min(n, m)) to store the frequency map.
        // This is the optimal time complexity for this problem.
        
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna