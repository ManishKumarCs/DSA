class Solution {
    public int[] sortedSquares(int[] nums) {
        int l=0;
        int r=nums.length-1;
        int result[] = new int[r+1];
        for(int i=r;i>=0;i--){
            if(Math.abs(nums[l])>Math.abs(nums[r])){
                result[i]=nums[l]*nums[l];
                l++;
            }else{
                result[i]=nums[r]*nums[r];
                r--;
            }
        }  
        return result; 
    }
}