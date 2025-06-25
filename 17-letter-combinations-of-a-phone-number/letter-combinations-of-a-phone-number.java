class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) return new ArrayList<>();
        Map<Character, String> comb = new HashMap<>();
        comb.put('2', "abc");
        comb.put('3', "def");
        comb.put('4', "ghi");
        comb.put('5', "jkl");
        comb.put('6', "mno");
        comb.put('7', "pqrs");
        comb.put('8', "tuv");
        comb.put('9', "wxyz");
        List<String> ans = new ArrayList<>();
        backtrack(digits, 0, new StringBuilder(), ans, comb);
        return ans;
    }
    void backtrack(String digits, int index, StringBuilder current, List<String> ans, Map<Character, String> comb) {
        if (index == digits.length()) {
            ans.add(current.toString());
            return;
        }
        char digit = digits.charAt(index);
        String letters = comb.get(digit);
        for (char c : letters.toCharArray()) {
            current.append(c);
            backtrack(digits, index + 1, current, ans, comb);
            current.deleteCharAt(current.length() - 1);   
        }
    }
}
