package com.jaxadev;

import java.util.Arrays;

public class LeetCode {

    public boolean isPalindrome(int x) {
        int palin = 0;
        int secondX = x;

        if (x != 0) {
            while (x != 0) {
                palin = palin * 10 + x % 10;
                x /= 10;
            }
        }
        if (palin == secondX && palin > 0) {
            return true;
        }
        return false;
        /*
        Runtime: 6 ms, faster than 99.99% of Java online submissions for Palindrome Number.
Memory Usage: 38.2 MB, less than 80.08% of Java online submissions for Palindrome Number.
         */
    }

    public int fib(int n) {

        int firstNum = 0, secondNum = 1;
        int result = 0;

        for (int i = 1; i <= n; ++i) {
            firstNum = secondNum;
            secondNum = result;
            result = firstNum + secondNum;
        }
        return result;
            /*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Fibonacci Number.
Memory Usage: 37.7 MB, less than 17.22% of Java online submissions for Fibonacci Number.
     */
    }

    public int countPrimes(int n) {
        if (n <= 1) {
            return 0;
        }
        boolean[] primes = new boolean[n];
        Arrays.fill(primes, true);

        for (int i = 2; i * i< n; i++) {
            System.out.println("i = " + i);
            if (!primes[i]) {
                continue;
            }
            for (int j = i * i; j < n; j += i) {
                primes[j] = false;
                System.out.println("j = " + j);
            }
        }
        int count = 0;
        for (int i = 2; i < primes.length; i++) {
            count += primes[i] ? 1 : 0;
        }
        return count;

        /*
        Runtime: 101 ms, faster than 36.19% of Java online submissions for Count Primes.
Memory Usage: 43.4 MB, less than 47.98% of Java online submissions for Count Primes.
         */

    }


}

