package com.jaxadev;

import java.util.Arrays;

/*
Created 14.10.2021 by Jahongir Mannonov
 */
public class Main {

    public static void main(String[] args) {


        LeetCode leetCode = new LeetCode();

        BlaBla blaBLa = new BlaBla();

//        System.out.println("leetCode.isPalindrome(121) = " + leetCode.isPalindrome(121));

//        System.out.println("leetCode.fib(50) = " + leetCode.fib(2));

//        System.out.println("leetCode.countPrimes(10) = " + leetCode.countPrimes(10));

//        System.out.println("leetCode.romanToInt(\"III\") = " + leetCode.romanToInt("III"));


//        System.out.println("leetCode.isPowerOfTwo(256) = " + leetCode.isPowerOfTwo(256));

//        System.out.println("leetCode.isPowerOfThree(27) = " + leetCode.isPowerOfThree(55));

//        System.out.println("leetCode.isPowerOfFour(16) = " + leetCode.isPowerOfFour(16));

//        System.out.println("leetCode.isPerfectSquare(25) = " + leetCode.isPerfectSquare(25));

//        System.out.println("leetCode.checkPerfectNumber(28) = " + leetCode.checkPerfectNumber(28));

//        System.out.println("leetCode.isUgly(6) = " + leetCode.isUgly(6));

//        System.out.println("leetCode.addDigits(101) = " + leetCode.addDigits(101));

//        System.out.println("blaBLa.isAnagram(\"Jahon\",\"nohaj\") = " + blaBLa.isAnagram("Jahon", "nohaJ"));

//        System.out.println("leetCode.isAnagram(\"joja\",\"ajoj\") = " + leetCode.isAnagram("joja", "ajoj"));

//        char[] chars = new char[10];
//        chars[0] = 'h';
//        chars[1] = 'e';
//        chars[2] = 'l';
//        chars[3] = 'l';
//        chars[4] = 'o';
//
//        leetCode.reverseString(chars);

//        System.out.println("leetCode.rotateString(\"abcde\", \"abced\") = " + leetCode.rotateString("abcde", "abced"));

//        System.out.println("leetCode.buddyStrings(\"jo'ja\",\"jo'ja\") = " + leetCode.buddyStrings("jo'ja", "jo'ja"));

//        System.out.println("leetCode.isValid(\"()\") = " + leetCode.isValid("()"));

//        System.out.println("leetCode.isPalindrome(\"Marge, let's \\\"[went].\\\" I await {news} telegram.\") = " + leetCode.isPalindrome("Marge, let's \"[went].\" I await {news} telegram."));

//        System.out.println("leetCode.countSegments(\"Hello, my name is John\") = " + leetCode.countSegments("Hello, my name is John"));

//        System.out.println("leetCode.multiply(\"10\",\"20\") = " + leetCode.multiply("10", "20"));

        int[] array2 = new int[3];
        array2[0] = 4;
        array2[1] = 4;
        array2[2] = 2;

        int[] array1 = new int[3];
        array2[0] = 5;
        array2[1] = 6;
        array2[2] = 2;

        System.out.println("leetCode.singleNumber(array) = " + leetCode.singleNumber(array2));

        System.out.println("leetCode.intersection(array1,array2) = " + Arrays.toString(leetCode.intersection(array1, array2)));

        System.out.println("leetCode.sortedSquares(array1) = " + Arrays.toString(leetCode.sortedSquares(array1)));

    }



}
