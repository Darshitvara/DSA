// 204. Count Primes
// Medium
// Topics
// premium lock icon
// Companies
// Hint
// Given an integer n, return the number of prime numbers that are strictly less than n.

 

// Example 1:

// Input: n = 10
// Output: 4
// Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
// Example 2:

// Input: n = 0
// Output: 0
// Example 3:

// Input: n = 1
// Output: 0
 

// Constraints:

// 0 <= n <= 5 * 106


class Solution {
    public int countPrimes(int n) {
        if (n <= 2) return 0;
        
        // Use boolean array to mark non-prime numbers
        boolean[] isNotPrime = new boolean[n];
        int count = 0;
        
        // Sieve of Eratosthenes
        for (int i = 2; i < n; i++) {
            if (!isNotPrime[i]) {
                count++;
                // Mark all multiples of i as non-prime
                // Check for overflow: if i * i would overflow, skip marking
                if ((long) i * i < n) {
                    for (int j = i * i; j < n; j += i) {
                        isNotPrime[j] = true;
                    }
                }
            }
        }
        
        return count;
    }
}