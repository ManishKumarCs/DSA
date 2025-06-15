class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<>();
        while(left<=right){
            int temp=left;
            boolean chk = true;
            while(temp>0){
                if(temp%10!=0&&left%(temp%10)==0);
                else chk=false;
                temp/=10;
            }
            if(chk)ans.add(left);
            left++;
        }    
        return ans;
    }
}