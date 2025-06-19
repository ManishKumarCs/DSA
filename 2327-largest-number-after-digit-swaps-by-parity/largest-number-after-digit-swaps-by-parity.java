class Solution {
    public int largestInteger(int num) {
        char[] digits = String.valueOf(num).toCharArray();
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        for (char ch : digits) {
            int digit = ch - '0';
            if (digit % 2 == 0) {
                even.add(digit);
            } else {
                odd.add(digit);
            }
        }
        Collections.sort(even, Collections.reverseOrder());
        Collections.sort(odd, Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();
        int evenIndex = 0, oddIndex = 0;
        for (char ch : digits) {
            int digit = ch - '0';
            if (digit % 2 == 0) {
                sb.append(even.get(evenIndex++));
            } else {
                sb.append(odd.get(oddIndex++));
            }
        }
        return Integer.parseInt(sb.toString());
    }
}
