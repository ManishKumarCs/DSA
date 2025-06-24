class Solution {
    public int generateKey(int num1, int num2, int num3) {
        int[] nums = {num1, num2, num3};
        String[] padded = new String[3];
        for (int i = 0; i < 3; i++) {
            padded[i] = String.format("%04d", nums[i]);
        }
        System.out.println(Arrays.toString(padded)); 
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            int minDigit = Math.min(
                Character.getNumericValue(padded[0].charAt(i)),
                Math.min(
                    Character.getNumericValue(padded[1].charAt(i)),
                    Character.getNumericValue(padded[2].charAt(i))
                )
            );
            sb.append(minDigit);
        }
        return Integer.parseInt(sb.toString());
    }
}

//-----------------------------------------------------------------------
// class Solution {
//     public int generateKey(int num1, int num2, int num3) {
//         String str = "0000";
//         int[] ans = new int[3];
//         ans[0] = num1;
//         ans[1] = num2;
//         ans[2] = num3;
//         String arr[] = new String[3];
//         for(int i=0;i<3;i++){
//             int num = ans[i];
//             int count=0;
//             while(num>0){
//                 count++;
//                 num/=10;
//             }
//             arr[i] = str.substring(0,4-count)+ans[i];
//         }
//         System.out.println(Arrays.toString(arr));
//         StringBuilder sb = new StringBuilder();
//         for(int i=0;i<4;i++){
//             sb.append(Math.min(Math.min(arr[0].charAt(i)-48,arr[1].charAt(i)-48),arr[2].charAt(i)-48));
//         }
//         int result  = Integer.valueOf(sb.toString());
//         return result;
//     }
// }