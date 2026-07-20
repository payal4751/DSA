class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int rows = grid.length;
        int cols = grid[0].length;
        int total = rows * cols;

        k %= total;

        int[][] shifted = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                // Convert 2D position to 1D index
                int currentIndex = i * cols + j;

                // Find new position after k shifts
                int newIndex = (currentIndex + k) % total;

                // Convert back to 2D position
                int newRow = newIndex / cols;
                int newCol = newIndex % cols;

                shifted[newRow][newCol] = grid[i][j];
            }
        }

        List<List<Integer>> result = new ArrayList<>();

        for (int[] row : shifted) {
            List<Integer> list = new ArrayList<>();
            for (int num : row) {
                list.add(num);
            }
            result.add(list);
        }

        return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna