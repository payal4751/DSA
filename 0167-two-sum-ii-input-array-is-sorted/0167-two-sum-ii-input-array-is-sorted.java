class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left=0;
        int right=numbers.length-1;

        while(left!=right){
            if(numbers[left]+numbers[right] == target){
                return new int []{++left,++right};
            }
            else if(numbers[left]+numbers[right] < target){
                left++;
            }
            else if(numbers[left]+numbers[right] > target){
                right--;
            }
        }
        return new int []{};
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna