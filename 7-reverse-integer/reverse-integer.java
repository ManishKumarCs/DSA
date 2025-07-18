class Solution {
    public int reverse(int x) {
        int reversedNo = 0;
        while (x != 0) {
            int LD = x % 10; 
            
            if (reversedNo > Integer.MAX_VALUE / 10 || reversedNo < Integer.MIN_VALUE / 10) {
                return 0; 
            }
            
            reversedNo = reversedNo * 10 + LD; 
            x = x / 10;  
        }
        return reversedNo;  
    }
}