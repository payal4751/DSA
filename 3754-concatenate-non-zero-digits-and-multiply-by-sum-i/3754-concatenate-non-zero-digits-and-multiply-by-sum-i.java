class Solution {
    public long sumAndMultiply(int n) {
        String str = String.valueOf(n);
        StringBuilder sb = new StringBuilder();
        int sum = 0;

        for (char ch : str.toCharArray()) {
            if (ch != '0') {
                sb.append(ch);
                sum += ch - '0';
            }
        }

        long x = sb.length() == 0 ? 0 : Long.parseLong(sb.toString());

        return x * sum;
    }
}

// class Solution {
//     public long sumAndMultiply(int n) {
//         String num="";
//         int sum=0;
//         while(n>0){
//             int digit=n%10;
//             if(digit!=0){
//                 num+=digit;
//                 sum+=digit;
//             }
//             n/=10;
//         }
//         String res="";

//         for(int i=num.length()-1;i>=0;i--){
//             res+=num.charAt(i);
//         }
//         long x = Long.parseLong(res.toString());
//         return 1L * x * sum;
//     }
// }

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna