class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(new int[]{i, nums[i]});
        }
        list.sort((a, b) -> Integer.compare(b[1], a[1]));
        List<int[]> topK = list.subList(0, k);
        topK.sort(Comparator.comparingInt(a -> a[0]));
        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = topK.get(i)[1];
        }
        return ans;
    }
}
