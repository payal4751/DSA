class Solution {

    public void rotate(int[] nums, int k) {
        // This solution correctly rotates the array using the reversal algorithm.
        // Time Complexity: O(n) where n = nums.length, because each element is swapped at most once.
        // Space Complexity: O(1) extra space, as the reversal is done in-place.
        // Steps:
        // 1. Normalize k: k %= n to handle cases where k >= n.
        // 2. Reverse the entire array.
        // 3. Reverse the first k elements.
        // 4. Reverse the remaining n - k elements.
        // This achieves the desired rotation and is optimal for this problem.
        int n = nums.length;
        k %= n;

        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    private void reverse(int[] nums, int left, int right) {

        while (left < right) {

            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna