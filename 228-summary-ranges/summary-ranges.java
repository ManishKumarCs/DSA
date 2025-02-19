class Solution {
    public List<String> summaryRanges(int[] nums) {
      ArrayList<String> list = new ArrayList<>();
      for(int i=0; i<nums.length; i++){
        StringBuilder str = new StringBuilder();
        boolean flag = false;
        str.append(nums[i]);
        int last =-1;
        while(i+1<nums.length && nums[i]+1 == nums[i+1]){
            flag=true;
            i++;
            last=nums[i];
        }
        if(flag){
            str.append("->");
            str.append(last);
        }
        list.add(str.toString());
      }  
      return list;
    }
}