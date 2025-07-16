class Solution {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] result = new int[n];
        int j=0;
        for(char ch:boxes.toCharArray()){
            int a = Integer.parseInt(String.valueOf(ch));
            int count =0;
            for(int i=0;i<n;i++){
                if(i==j)continue;
                else if(boxes.charAt(i)=='1')count+=Math.abs(j-i);
            }
            result[j]=count;
            j++;
        }
        return result;
    }
}