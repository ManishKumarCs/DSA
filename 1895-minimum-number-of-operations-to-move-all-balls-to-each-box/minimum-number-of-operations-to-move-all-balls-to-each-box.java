// class Solution {
//     public int[] minOperations(String boxes) {
//         int n = boxes.length();
//         int[] result = new int[n];
//         int j=0;
//         for(char ch:boxes.toCharArray()){
//             int a = Integer.parseInt(String.valueOf(ch));
//             int count =0;
//             for(int i=0;i<n;i++){
//                 if(i==j)continue;
//                 else if(boxes.charAt(i)=='1')count+=Math.abs(j-i);
//             }
//             result[j]=count;
//             j++;
//         }
//         return result;
//     }
// }

class Solution {
    public int[] minOperations(String boxes) {
        List<Integer> li=new ArrayList<>();
        int n=boxes.length();
        int ans[]=new int[n];
        for(int i=0;i<n;i++)
        {
            char ch=boxes.charAt(i);
            if(ch=='1') li.add(i);
        }
        for(int i=0;i<n;i++)
        {
            int temp=0;
            for(int j=0;j<li.size();j++)
            {
                temp+=Math.abs(li.get(j)-i);
            }
            ans[i]=temp;
        }
        return ans;
    }
}