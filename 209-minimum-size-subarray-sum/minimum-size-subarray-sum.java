class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        // int i =0;
        // int j=0;
        // int n = nums.length;
        // int min = Integer.MAX_VALUE;
        // int sum =0;
        // while(j<n){
        //             sum = sum + nums[j];

        //  while(sum>=target){
        //     min = Math.min((j-i+1),min);
        //     sum = sum - nums[i];
        //      i++;

        //  }
        // j++;
         
        // }
        // return min == Integer.MAX_VALUE? 0: min;
        // }

    //==================================================================

    int start=0;
    int currWindow=0;
    int min=nums.length+1;
    for(int end=0;end<nums.length;end++){
        currWindow+=nums[end];
        while(currWindow>=target){
            min=Math.min(min,end-start+1);
            currWindow-=nums[start];
            start++;
        }
    }
    return min<nums.length+1?min:0;        
}
}