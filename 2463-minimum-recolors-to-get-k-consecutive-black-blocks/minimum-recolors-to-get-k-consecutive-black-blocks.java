class Solution {
    public int minimumRecolors(String blocks, int k) {
    int ans=blocks.length()+1;
    // for(int i=0;i<=blocks.length()-k;i++){
    //     int count=0;
    //     for(int j=i;j<k+i;j++){
    //         if(blocks.charAt(j)!='B')
    //         count++;
    //     }
    //     ans = Math.min(ans,count);
    // }  
    // return ans; 
    int count=0;
    for(int i=0;i<blocks.length();i++){
        if(((i-k)>=0) && (blocks.charAt(i-k)=='W')) count--;
        if(blocks.charAt(i)=='W')count++;
        if(i>=k-1) ans=Math.min(ans,count);
    }
    return ans;
    }
}