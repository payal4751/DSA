class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int [] sortedArr=arr.clone();
        Arrays.sort(sortedArr);

        HashMap <Integer,Integer> map=new HashMap<>();
        int rank=1;

        for(int num:sortedArr){
            if(!map.containsKey(num)){
                map.put(num,rank++);
            }
        }

        int [] ans=new int [arr.length];
        for(int i=0;i<arr.length;i++){
            ans[i]=map.get(arr[i]);
        }

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna