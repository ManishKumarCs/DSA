class Solution {
    public int lenLongestFibSubseq(int[] arr) {
        int n=arr.length;
        Set<Integer> set = new HashSet<>();
        for(int num:arr) set.add(num);
         int maxLen = 0;
        for (int start = 0; start < n; ++start) {
            for (int next = start + 1; next < n; ++next) {
                int prev = arr[next];
                int curr = arr[start] + arr[next];
                int len = 2;
                while (set.contains(curr)) {
                    int temp = curr;
                    curr += prev;
                    prev = temp;
                    maxLen = Math.max(maxLen, ++len);
                }
            }
        }
        return maxLen;
    }
}