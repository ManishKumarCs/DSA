class Solution {
    public boolean checkPowersOfThree(int n) {
        return power(0, n);
    }
    public boolean power(int power, int n) {
        if (n == 0) return true;
        if (Math.pow(3, power) > n) return false;
        boolean add = power(power + 1,n - (int) Math.pow(3, power));
        boolean leave = power(power + 1, n);
        return add||leave;
    }
}