class Solution {
    public int reverseDegree(String s) {
        int ans = 0;
        int i=1;
        for(char c:s.toCharArray()){
            int ind = c-'a';
            System.out.println(ind);
            if(ind<13)ind=26-ind;
            else if(ind>13)ind=26-ind;
            ans+=ind*i++;
        }
        return ans;
    }
}