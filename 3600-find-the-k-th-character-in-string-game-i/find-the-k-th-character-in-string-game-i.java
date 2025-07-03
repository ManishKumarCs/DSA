class Solution {
    public char kthCharacter(int k) {
        StringBuilder a = new StringBuilder("a");
        while(a.length()<k){
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<a.length();i++){
                char ch = (char)(a.charAt(i)+1);
                sb.append(ch);
            }
            a.append(sb);
        }
        return a.charAt(k-1);
    }
}