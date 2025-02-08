class Solution {
    public int longestAlternatingSubarray(int[] nums, int threshold) {
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>threshold || nums[i]%2!=0)continue;
            int count =1;
            for(int j=i;j<nums.length-1;j++){
                if(nums[j]%2 != nums[j+1]%2 && nums[j+1]<=threshold)count++;  
                else break;
            }
            max= Math.max(max,count);
        }

        return max;
    }
}