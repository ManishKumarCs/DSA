class Solution {
    public int lengthOfLongestSubstring(String s) {
    //     int maxlen=0;
    //    int len=0;
    //    int i=0;
    //    int j=-1;
    //    boolean[] arr=new boolean[256];
    //    while(i<s.length()){
    //     char aquire=s.charAt(i);
    //     while(arr[aquire]==true){
    //         j++;
    //         char release=s.charAt(j);
    //         arr[release]=false;
    //     }
    //     arr[aquire]=true;
    //     len=i-j;
    //     if(len>maxlen){
    //         maxlen=len;
    //     }
    //     i++;
    //    }
    //    return maxlen;

    //=========================================================

    HashMap<Character,Integer> map = new HashMap<>();
    int start=0;
    int max=0;
    for(int end =0;end<s.length();end++){
        char currChar = s.charAt(end);
        if(map.containsKey(currChar)){
            start=Math.max(start,map.get(currChar)+1);
        }
        map.put(currChar,end);
        max = Math.max(max,end-start+1);
    }
    return max;

    }
}