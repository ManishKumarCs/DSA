class Solution {
    public boolean isMonotonic(int[] nums) {
    // if(nums.length<=2)return true;
    // int count=0;
    // int count2=0;
    // for(int i=0;i<nums.length-1;i++){
    //     if(nums[i]-nums[i+1]>0)count++;
    //     else if(nums[i]-nums[i+1]<0)count2++;
    // } 
    // if(count==0||count2==0)return true;
    // return false;  

    // Optimized
    boolean inc = true;
    boolean dec = true;
    for(int i=1;i<nums.length;i++){
        if(nums[i]>nums[i-1])dec=false;
        else if(nums[i]<nums[i-1])inc=false;
    }
    return inc || dec;
    }
}