class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> map = new TreeMap<>();
        for(char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        List<Character> chars = new ArrayList<>();
        for(char c : s.toCharArray()){
            chars.add(c);
        }
        chars.sort((a,b)->{
            int fa = map.get(a);
            int fb = map.get(b);
            if(fa==fb) return Character.compare(a,b);
            return fb-fa;
        });
        StringBuilder ans = new StringBuilder();
        for(char c: chars){
            ans.append(c);
        }
        return ans.toString();   
    }
}