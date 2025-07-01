class Solution {
    public String[] divideString(String s, int k, char fill) {
        int size = (s.length() + k - 1) / k; 
        String[] arr = new String[size];
        int j = 0;

        for (int i = 0; i < s.length(); i += k) {
            int end = Math.min(i + k, s.length());
            StringBuilder sub = new StringBuilder(s.substring(i, end));
            while (sub.length() < k) {
                sub.append(fill);
            }
            arr[j++] = sub.toString();
        }
        return arr;
    }
}
