class Solution {
    public int[] findArray(int[] pref) {
        if(pref.length==1)return new int[] {pref[0]};
        int ans[] = new int[pref.length];
        ans[0]=pref[0];
        for(int i=0;i<pref.length-1;i++){
            ans[i+1]=pref[i]^pref[i+1];
        }
        return ans;
    }
}