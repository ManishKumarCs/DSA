class Solution {
    public int maxArea(int[] height) {
        int start=0;
        int end=height.length-1;
        int maxWater = 0;
        while(start<end){
            int h = end-start;
            int min = Math.min(height[start],height[end]);
            maxWater = Math.max(maxWater,h*min);
            if(height[start]<height[end])start++;
            else end--;
        }
        return maxWater;
    }
}