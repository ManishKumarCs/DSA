class Solution {
    public int minimumRecolors(String blocks, int k) {
    int ans=blocks.length()+1;
     for(int i=0;i<=blocks.length()-k;i++){
        int count=0;
        for(int j=i;j<k+i;j++){
            if(blocks.charAt(j)!='B')
            count++;
        }
        ans = Math.min(ans,count);
    }  
    return ans; 
    }
}