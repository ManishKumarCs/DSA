class Solution {
    public int myAtoi(String s) {
        int i = 0, n = s.length();
        long result = 0;
        boolean negative = false;
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            negative = s.charAt(i) == '-';
            i++;
        }
        while (i < n && Character.isDigit(s.charAt(i))) {
            result = result * 10 + (s.charAt(i) - '0');
            if (!negative && result > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if (negative && -result < Integer.MIN_VALUE) return Integer.MIN_VALUE;
            i++;
        }
        return negative ? (int)-result : (int)result;
    }
}
