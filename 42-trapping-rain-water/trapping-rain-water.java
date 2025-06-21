class Solution {
    // public int trap(int[] height) {
    //     int i=0,left_max=height[0],sum=0;
    //     int j=height.length-1,right_max=height[j];
    //     while (i<j)
    //     {
    //         if(left_max <= right_max)
    //         {
    //             sum+=(left_max-height[i]);
    //             i++;
    //             left_max=Math.max(left_max,height[i]);
    //         }
    //         else 
    //         {
    //             sum+=(right_max-height[j]);
    //             j--;
    //             right_max=Math.max(right_max,height[j]);
    //         }
    //     }
    //     return sum;
    // }
    public int trap(int[] height) {
        int n = height.length;
        int maxL[] = new int[n];
        int maxR[] = new int[n];
        maxL[0]=height[0];
        maxR[n-1]=height[n-1];
        for(int i=1;i<n;i++){
            maxL[i]=Math.max(maxL[i-1],height[i]);
            maxR[n-i-1]=Math.max(maxR[n-i],height[n-i-1]);
        }
        int trapWater = 0;
        for(int i=0;i<n;i++){
           trapWater += Math.max(0, Math.min(maxL[i], maxR[i]) - height[i]);
        }
        return trapWater;
    }
}