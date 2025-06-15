class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<>();
        while (left <= right) {
            int temp = left;
            boolean chk = true;
            while (temp > 0) {
                int digit = temp % 10;
                if (digit == 0 || left % digit != 0) {
                    chk = false;
                    break;
                }
                temp /= 10;
            }
            if (chk) ans.add(left);
            left++;
        }    
        return ans;
    }
}
