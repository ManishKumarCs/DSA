class Solution {
    public int majorityElement(int[] nums) {
        // Arrays.sort(nums);
        // int n = nums.length;
        // return nums[n/2];
        int candidate = 0;
        int count=0;
        for(int num:nums){
            if(count==0)candidate=num;
            if(num==candidate)count++;
            else count--;
        }
        return candidate;
    }
}