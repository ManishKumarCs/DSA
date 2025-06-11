class Solution {
    public int distributeCandies(int[] candyType) {
     Set<Integer> set = new HashSet<>();
     for(int i=0;i<candyType.length;i++){
        set.add(candyType[i]);
     }
     int eat = candyType.length/2;
     if(eat>=set.size())return set.size();   
     return eat;
    }
}