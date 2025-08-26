class Solution {
    public void moveZeroes(int[] nums) {
    //    int zero=0;
    //    for(int nonzero=0;nonzero<nums.length;nonzero++){
    //         if(nums[nonzero]!=0){
    //             int temp=nums[zero];
    //             nums[zero]=nums[nonzero];
    //             nums[nonzero]=temp;
    //             zero++;
    //         }
    //    } 
    int i=0;
    for(int num:nums){
        if(num!=0)nums[i++]=num;
    }
    for(;i<nums.length;i++)nums[i]=0;
    }
}