class Solution {
   public int[] maxSubsequence(int[] nums, int k) {
        if (nums != null) {
            int len = nums.length;
            if (len > k && k > 0) {
                int MAX = Integer.MIN_VALUE;
                int MIN = Integer.MAX_VALUE;
                for (int i : nums) {
                    if (MIN > i)
                        MIN = i;
                    if (MAX < i)
                        MAX = i;
                }
                int diff = MAX - MIN + 1;
                int[] freqCount = new int[diff];
                for (int num : nums) {
                    freqCount[num - MIN]++;
                }
                int[] result = new int[k];
                int tempLength = len;
                for (int i = 0; tempLength > k; ) {
                    if (freqCount[i] > 0) {
                        freqCount[i]--;
                        tempLength--;
                    } else {
                        i++;
                    }
                }
                int index = 0;
                for (int i = 0; i < len; i++) {
                    if (freqCount[nums[i] - MIN] > 0) {
                        result[index++] = nums[i];
                        freqCount[nums[i] - MIN]--;
                    }
                }
                nums = result;
            }
        }
        return nums;
    }
}