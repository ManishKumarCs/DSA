// class Solution {
//     public int[] closestPrimes(int left, int right) {
    //     int prevPrime = -1, closestA = -1, closestB = -1;
    //     int minDifference = (int) 1e6;
    //     for (int candidate = left; candidate <= right; candidate++) {
    //         if (isPrime(candidate)) {
    //             if (prevPrime != -1) {
    //                 int difference = candidate - prevPrime;
    //                 if (difference < minDifference) {
    //                     minDifference = difference;
    //                     closestA = prevPrime;
    //                     closestB = candidate;
    //                 }
    //                 if (difference == 2 || difference == 1) return new int[] {
    //                     prevPrime,
    //                     candidate,
    //                 };
    //             }
    //             prevPrime = candidate;
    //         }
    //     }
    //     return (closestA == -1) ? new int[] { -1, -1 } : new int[] { closestA, closestB };
    // }
    // private boolean isPrime(int number) {
    //     if (number < 2) return false;
    //     if (number == 2 || number == 3) return true;
    //     if (number % 2 == 0) return false;
    //     for (int divisor = 3; divisor * divisor <= number; divisor += 2) {
    //         if (number % divisor == 0) return false;
    //     }
    //     return true;
    // }
// }


class Solution {
    public int[] closestPrimes(int left, int right) {
        boolean[] isPrime = new boolean[right + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for (int i = 2; i * i <= right; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= right; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        
        int prev = -1;
        int minDiff = Integer.MAX_VALUE;
        int[] result = {-1, -1};

        for (int i = left; i <= right; i++) {
            if (isPrime[i]) {
                if (prev != -1) {
                    int diff = i - prev;
                    if (diff < minDiff) {
                        minDiff = diff;
                        result[0] = prev;
                        result[1] = i;
                    }
                }
                prev = i;
            }
        }

        return result;
    }
}
