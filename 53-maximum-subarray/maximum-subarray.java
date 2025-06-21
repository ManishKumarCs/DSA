class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currSum=0;
        for(int n:nums){
            currSum+=n;
            maxSum=(maxSum>currSum)?maxSum:currSum;
            if(currSum<0)currSum=0;
        }
        return maxSum;
    }
}