package com.jaxadev;

public class LeetCode {

    public boolean isPalindrome(int x) {
        int palin = 0;
        int secondX = x;

        if (x != 0 ) {
            while (x != 0) {
                palin = palin * 10 + x % 10;
                x /= 10;
            }
        }
        if (palin == secondX && palin > 0) {
            return true;
        }
        return false;
    }

}
