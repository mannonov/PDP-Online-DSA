package com.jaxadev;

import java.util.ArrayList;
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

        for (int i = 2; i * i < n; i++) {
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

    public int romanToInt(String S) {
        int result = 0, num = 0;
        for (int i = S.length() - 1; i >= 0; i--) {
            switch (S.charAt(i)) {
                case 'I' -> num = 1;
                case 'V' -> num = 5;
                case 'X' -> num = 10;
                case 'L' -> num = 50;
                case 'C' -> num = 100;
                case 'D' -> num = 500;
                case 'M' -> num = 1000;
            }
            if (4 * num < result) result -= num;
            else result += num;
        }
        return result;

        /*
        Runtime: 5 ms, faster than 71.51% of Java online submissions for Roman to Integer.
Memory Usage: 41.6 MB, less than 33.86% of Java online submissions for Roman to Integer.
         */
    }

    public boolean isPowerOfTwo(int n) {

        if (n == 0) return false;

//        while (n % 2 == 0) {
//
//            n = n / 2;
//
//        }

        return ((long) n & ((long) n - 1)) == 0;

    }

    public boolean isPowerOfThree(int n) {

        if (n == 0) return false;

        //        while (n % 3 == 0) {
//
//            n = n / 3;
//
//        }

        return n > 0 && 1162261467 % n == 0;

        /*
        Runtime: 10 ms, faster than 99.98% of Java online submissions for Power of Three.
Memory Usage: 38.8 MB, less than 66.19% of Java online submissions for Power of Three.
         */

    }

    public boolean isPowerOfFour(int n) {
        return (n > 0) && ((n & (n - 1)) == 0) && ((n % 3) == 1);
        /*
        Runtime: 1 ms, faster than 99.63% of Java online submissions for Power of Four.
Memory Usage: 38.2 MB, less than 20.38% of Java online submissions for Power of Four.
         */

    }

    public boolean isPerfectSquare(int num) {

//        int i = 1;
//
//        while (num > 0) {
//            num = num - i;
//            i = i + 2;
//        }
//
//        return num == 0;

//            long x = num;
//
//            while (x * x > num) {
//                x = (x + num / x) / 2;
//            }
//
//            return x * x == num;

        int low = 1, high = num;
        while (low <= high) {
            long mid = (low + high) >>> 1;
            if (mid * mid == num) {
                return true;
            } else if (mid * mid < num) {
                low = (int) mid + 1;
            } else {
                high = (int) mid - 1;
            }
        }
        return false;

        /*
        Runtime: 0 ms, faster than 100.00% of Java online submissions for Valid Perfect Square.
Memory Usage: 35.4 MB, less than 93.29% of Java online submissions for Valid Perfect Square.
         */

    }

    public boolean checkPerfectNumber(int num) {

        if (num == 1) {
            return false;
        }
        int sum = 1;
        int mid = (int) Math.sqrt(num);

        for (int i = 2; i <= mid; i++) {
            if (num % i == 0) {
                sum += i;
                sum += num / i;
            }
        }
        return sum == num;

        /*
        Runtime: 3 ms, faster than 52.15% of Java online submissions for Perfect Number.
Memory Usage: 37.6 MB, less than 22.56% of Java online submissions for Perfect Number.
         */

    }

    public boolean isUgly(int num) {

        if (num == 0) return false;
        if (num == 1) return true;

        while (num != 1) {
            if (num % 2 == 0) num /= 2;
            else if (num % 3 == 0) num /= 3;
            else if (num % 5 == 0) num /= 5;
            else return false;
        }
        return true;

        /*
        Runtime: 1 ms, faster than 100.00% of Java online submissions for Ugly Number.
Memory Usage: 36.2 MB, less than 54.29% of Java online submissions for Ugly Number.
         */

    }

    public int addDigits(int num) {
        /*
        100a+10b+c, then (100a+10b+c)%9=(a+99a+b+9b+c)%9=(a+b+c)%9
         */

        if (num == 0) return 0;

        if (num % 9 == 0) return 9;

        else return num % 9;

/*
Runtime: 1 ms, faster than 100.00% of Java online submissions for Add Digits.
Memory Usage: 38.5 MB, less than 7.44% of Java online submissions for Add Digits.
 */
    }

    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) return false;

        int[] alphabet = new int[26];

        for (int i = 0; i < s.length(); i++) {
            alphabet[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < t.length(); i++) {
            alphabet[t.charAt(i) - 'a']--;
        }

        for (int i : alphabet) {
            if (i != 0) return false;
        }

        return true;

        /*
        Runtime: 3 ms, faster than 81.04% of Java online submissions for Valid Anagram.
Memory Usage: 40.4 MB, less than 31.15% of Java online submissions for Valid Anagram.
         */


    }

    public void reverseString(char[] s) {

        int start = 0;
        int end = s.length - 1;

        while (start < end) {

            char ch = s[start];
            s[start] = s[end];
            s[end] = ch;
            start++;
            end--;
        }

        /*
        Runtime: 1 ms, faster than 95.95% of Java online submissions for Reverse String.
Memory Usage: 52.7 MB, less than 19.22% of Java online submissions for Reverse String.
         */

    }

    public boolean rotateString(String s, String goal) {

        if (s.length() != goal.length()) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            if (rotateString(s, goal, i)) {
                return true;
            }
        }
        return false;
    }

    private boolean rotateString(String s, String goal, int rotation) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != goal.charAt((i + rotation) % goal.length())) {
                return false;
            }
        }
        return true;
    }

    /*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Rotate String.
Memory Usage: 38.4 MB, less than 42.88% of Java online submissions for Rotate String.
     */

}

