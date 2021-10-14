package com.jaxadev;

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


}
