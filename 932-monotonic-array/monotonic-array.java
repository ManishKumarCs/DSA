class Solution {
    public boolean isMonotonic(int[] nums) {
     int count=0;
     int count2=0;
     for(int i=0;i<nums.length-1;i++){
        if(nums[i]-nums[i+1]>0)count++;
        else if(nums[i]-nums[i+1]<0)count2++;
     } 
     if(count==0||count2==0)return true;
     return false;  
    }
}