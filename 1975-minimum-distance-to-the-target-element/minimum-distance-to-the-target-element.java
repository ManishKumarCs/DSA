class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int ans = Integer.MAX_VALUE;
        for(int i=0; i< nums.length; i++){
            if (nums[i] == target){
                ans = Math.abs(i - start) < ans ? Math.abs(i - start)  : ans;
            }
        }
        return ans;
    }
}