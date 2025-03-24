class Solution {
    public int minTimeToType(String word) {
        char a ='a';
        int len = word.length();
        int i=1;
        int moves = Math.min(Math.abs(word.charAt(0) - 'a'),26-Math.abs(word.charAt(0) - 'a'));
        System.out.println(moves);
        while(i<len){

            moves+=Math.min(Math.abs(word.charAt(i)-word.charAt(i-1)),(26-Math.abs(word.charAt(i)-word.charAt(i-1))));
            i++;
            System.out.println(moves);
        }
        return moves+len;
    }
}