class Solution {
    public int maxSum(int[] nums) {
        if(nums.length==1)return nums[0];
        Set<Integer> set = new HashSet<>();
        int max=Integer.MIN_VALUE;
        for(int num:nums){
            if(num>0)set.add(num);
            if(max<num)max=num;
        }
        int ans=0;
        for(int num:set){
            ans+=num;
        }
        if(set.size()==0)return max;
        return ans;
    }
}