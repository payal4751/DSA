class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;

        // Your current solution is CORRECT and will pass all test cases.
        // Time Complexity: O(n) - You traverse the array twice.
        // Space Complexity: O(n) - You are using an auxiliary array 'temp' of size n.
        //
        // COACH'S TIP: While this works, can you solve this in O(1) extra space?
        // Hint: Try the "Reversal Algorithm". 
        // 1. Reverse the entire array.
        // 2. Reverse the first k elements.
        // 3. Reverse the remaining n-k elements.
        //
        // Since your current logic is correct, feel free to submit! 
        // But I highly recommend trying the in-place reversal method next to optimize space.

        int[] temp = new int[n];

        for (int i = 0; i < n; i++) {
            temp[(i + k) % n] = nums[i];
        }

        for (int i = 0; i < n; i++) {
            nums[i] = temp[i];
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna