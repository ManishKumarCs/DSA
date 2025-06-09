class Solution {
    public String clearDigits(String s) {
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {
            if (!Character.isDigit(c)) {
                st.push(c);
            } else if (!st.isEmpty()) {
                st.pop();
            }
        } 
        StringBuilder ans = new StringBuilder();
        for (char ch : st) {
            ans.append(ch);
        }
        return ans.toString();
    }
}
