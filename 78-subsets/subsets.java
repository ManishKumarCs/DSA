class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        solve(0,res,new ArrayList<>(),nums,nums.length);
        return res;
    }
    static void solve(int idx, List<List<Integer>> res, ArrayList<Integer> arr,int[] nums, int n){
        if(idx==n){
            res.add(new ArrayList<>(arr));
            return;
        }
        arr.add(nums[idx]);
        solve(idx+1,res,arr,nums,n);
        arr.remove(arr.size()-1);
        solve(idx+1,res,arr,nums,n);
    }
}