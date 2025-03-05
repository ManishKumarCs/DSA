class Solution {
    public long coloredCells(int n) {
     if(n<=1)return 1;
    //  return (n-1)*4 + coloredCells(n-1);
     //or
     return (long)n*n+(long)(n-1)*(n-1);   
    }
}