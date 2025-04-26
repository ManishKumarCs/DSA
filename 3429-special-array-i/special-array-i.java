class Solution {
    public boolean isArraySpecial(int[] nums) {
        for (int index = 0; index < nums.length - 1; index++) {
            if (((nums[index] & 1) ^ (nums[index + 1] & 1)) == 0) {
                return false;
            }
        }
        return true;
    }
}