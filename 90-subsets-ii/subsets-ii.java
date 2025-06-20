class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        solve(0, res, new ArrayList<>(), nums);
        return res;
    }
    static void solve(int idx, List<List<Integer>> res, List<Integer> temp, int[] nums) {
        res.add(new ArrayList<>(temp));
        for (int i = idx; i < nums.length; i++) {
            if (i > idx && nums[i] == nums[i - 1]) continue;
            temp.add(nums[i]);
            solve(i + 1, res, temp, nums);
            temp.remove(temp.size() - 1);
        }
    }
}