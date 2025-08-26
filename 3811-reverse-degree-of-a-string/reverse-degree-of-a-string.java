class Solution {
    public int reverseDegree(String s) {
        int ans = 0;
        int i=1;
        for(char c:s.toCharArray()){
            int ind = c-'a';
            int rev = 26-ind;
            ans+=rev*i++;
        }
        return ans;
    }
}