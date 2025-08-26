class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int maxDiag = Integer.MIN_VALUE;  // store squared diagonal
        int maxArea = 0;
        
        for (int[] rect : dimensions) {
            int l = rect[0];
            int b = rect[1];
            int diagSq = l * l + b * b;  // squared diagonal
            int area = l * b;
            
            if (diagSq > maxDiag || (diagSq == maxDiag && area > maxArea)) {
                maxDiag = diagSq;
                maxArea = area;
            }
        }
        
        return maxArea;
    }
}
