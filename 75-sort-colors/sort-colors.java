class Solution {
    public void sortColors(int[] nums) {
        int start = 0;
        int mid = 0;
        int end = nums.length-1;
        while(mid<=end){
            if(nums[mid]==0){
            swap(mid,start,nums);
            start++;
            mid++;
        }
        else if(nums[mid]==2){
            swap(mid,end,nums);
            end--;
        }
        else mid++;
        }
    }
    void swap(int first, int second, int[] nums){
        int temp= nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}