class Solution {

    public int[] applyOperations(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        int count = 0;
        for (int i=0;i<n-1;i++) {
            if (nums[i] == nums[i + 1] && nums[i] != 0) {
                nums[i] *=2;
                nums[i+1] =0;
            }
        }
        for (int num : nums) {
            if (num != 0) arr[count++] = num;
        }
        while (count<n) arr[count++] = 0;
        return arr;
    }
}