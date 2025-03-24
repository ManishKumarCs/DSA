class Solution {
    public int minTimeToType(String word) {
        int moves = Math.min(Math.abs(word.charAt(0) - 'a'), 26 - Math.abs(word.charAt(0) - 'a')); 
        for (int i = 1; i < word.length(); i++) {
            int diff = Math.abs(word.charAt(i) - word.charAt(i - 1));
            moves += Math.min(diff, 26 - diff);
        }
        return moves + word.length();
    }
}
