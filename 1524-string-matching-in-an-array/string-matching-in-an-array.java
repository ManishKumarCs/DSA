class Solution {
    public List<String> stringMatching(String[] words) {
        Set<String> list = new HashSet<>();
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words.length;j++){
                if(j!=i&& words[i].contains(words[j])){
                    list.add(words[j]);
                }
            }
        }
        return new ArrayList<>(list);
    }
}