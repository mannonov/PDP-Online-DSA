package com.jaxadev;

import java.lang.reflect.Array;
import java.util.*;

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

        /*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Rotate String.
Memory Usage: 38.4 MB, less than 42.88% of Java online submissions for Rotate String.
     */

    }

    public boolean buddyStrings(String s, String goal) {
//
//        long resultS = 0;
//        long resultGoal = 0;
//
//
//        for (char ch : s.toCharArray()) {
//            resultS += (int)ch;
//        }
//
//        for (char ch : goal.toCharArray()) {
//            resultGoal += (int)ch;
//        }
//
//        return resultGoal == resultS ;

        if (s.length() != goal.length()) return false;
        Set<Character> set = new HashSet();
        for (char ch : s.toCharArray()) {
            set.add(ch);
        }
        if (s.equals(goal)) {
            return set.size() < s.length();
        }
        int index1 = -1;
        int index2 = -1;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != goal.charAt(i)) {
                count++;
                if (index1 == -1) index1 = i;
                else if (index2 == -1) index2 = i;
                if (count > 2) return false;
            }
        }
        if (count == 2) {
            return s.charAt(index1) == goal.charAt(index2) && s.charAt(index2) == goal.charAt(index1);
        } else {
            return false;
        }

        /*
        Runtime: 3 ms, faster than 61.23% of Java online submissions for Buddy Strings.
Memory Usage: 39.1 MB, less than 56.32% of Java online submissions for Buddy Strings.
         */

    }

    public boolean isValid(String s) {
        char[] stack = new char[s.length()];
        int head = 0;
        for (char c : s.toCharArray()) {
            switch (c) {
                case '{':
                case '[':
                case '(':
                    stack[head++] = c;
                    break;
                case '}':
                    if (head == 0 || stack[--head] != '{') return false;
                    break;
                case ')':
                    if (head == 0 || stack[--head] != '(') return false;
                    break;
                case ']':
                    if (head == 0 || stack[--head] != '[') return false;
                    break;
            }
        }
        return head == 0;
        /*
        Runtime: 0 ms, faster than 100.00% of Java online submissions for Valid Parentheses.
Memory Usage: 39 MB, less than 10.77% of Java online submissions for Valid Parentheses.
         */

    }

    public boolean isPalindrome(String s) {

        StringBuilder newString = new StringBuilder();

        s = s.toLowerCase();

        for (char ch : s.toCharArray()) {

            if (97 <= (int) ch && (int) ch <= 122 || 48 <= (int) ch && (int) ch <= 57) {

                newString.append(ch);
            }
        }

        String nextS = new StringBuilder(newString).reverse().toString();

        return nextS.equals(newString.toString());

        /*
Runtime: 4 ms, faster than 63.63% of Java online submissions for Valid Palindrome.
Memory Usage: 38.6 MB, less than 97.56% of Java online submissions for Valid Palindrome.
         */

    }

    public int countSegments(String s) {

        int result = 0;

        for (int i = 0; i < s.length(); i++) {

            if ((int) s.charAt(i) != 32 && (i == 0 || (int) s.charAt(i - 1) == 32)) {
                result++;
            }

        }

        return result;

        /*
        Runtime: 0 ms, faster than 100.00% of Java online submissions for Number of Segments in a String.
Memory Usage: 38.8 MB, less than 13.70% of Java online submissions for Number of Segments in a String.
         */

    }

    public String multiply(String num1, String num2) {

        if ("0".equals(num1) || "0".equals(num2)) {
            return "0";
        }

        int[] number = new int[num1.length() + num2.length() - 1];

        for (int i = 0; i < num1.length(); i++) {
            for (int j = 0; j < num2.length(); j++) {
                System.out.println("(num1.charAt(i) - '0') = " + (num1.charAt(i) - '0'));
                System.out.println("(num2.charAt(j) - '0') = " + (num2.charAt(j) - '0'));
                number[i + j] += (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                System.out.println("number[i + j] = " + number[i + j]);
            }
        }

        for (int i = number.length - 1; i > 0; i--) {
            System.out.println("number[i - 1] = " + number[i - 1]);
            number[i - 1] += number[i] / 10;
            System.out.println("number[i - 1] = " + number[i - 1]);
            number[i] %= 10;
            System.out.println("number[i] = " + number[i]);
        }

        StringBuilder sb = new StringBuilder();
        for (int i : number) {
            sb.append(i);
        }

        return sb.toString();

        /*
        Runtime: 5 ms, faster than 62.53% of Java online submissions for Multiply Strings.
Memory Usage: 39.7 MB, less than 27.60% of Java online submissions for Multiply Strings.
         */

    }

    public int singleNumber(int[] nums) {

        int result = 0;

        for (int num : nums) {

            result ^= num;

        }

        return result;

        /*
        Runtime: 1 ms, faster than 94.58% of Java online submissions for Single Number.
Memory Usage: 39 MB, less than 76.48% of Java online submissions for Single Number.
         */

    }

    public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> set = new HashSet<>();

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = 0;
        int j = 0;

        while (i < nums1.length && j < nums2.length) {

            if (nums1[i] < nums2[j]) {

                i++;

            } else if (nums1[i] > nums2[j]) {

                j++;

            } else {

                set.add(nums1[i]);

                i++;
                j++;

            }
        }

        int[] result = new int[set.size()];

        int k = 0;

        for (Integer num : set) {

            result[k++] = num;

        }

        return result;

        /*
        Runtime: 2 ms, faster than 96.33% of Java online submissions for Intersection of Two Arrays.
Memory Usage: 39.4 MB, less than 46.24% of Java online submissions for Intersection of Two Arrays.
         */

    }

    public int[] sortedSquares(int[] nums) {

//        for (int i = 0; i < nums.length; i++) {
//
//            nums[i] = nums[i] * nums[i];
//
//        }
//
//        int temp = 0;
//
//        for (int i = 0; i <nums.length; i++) {
//            for (int j = i+1; j <nums.length; j++) {
//                if(nums[i] >nums[j]) {      //swap elements if not in order
//                    temp = nums[i];
//                    nums[i] = nums[j];
//                    nums[j] = temp;
//                }
//            }
//        }
//
//        return nums;


        int[] result = new int[nums.length];
        int i = 0, j = nums.length - 1, k = nums.length - 1;

        while (k >= 0) {
            if (Math.abs(nums[i]) > Math.abs(nums[j])) {
                result[k--] = nums[i] * nums[i++];
            } else {
                result[k--] = nums[j] * nums[j--];
            }
        }

        return result;

        /*
        Runtime: 1 ms, faster than 100.00% of Java online submissions for Squares of a Sorted Array.
Memory Usage: 52.9 MB, less than 35.95% of Java online submissions for Squares of a Sorted Array.
         */

    }

    public int xorOperation(int n, int start) {

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = start + (2 * i);
        }

        int result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            result ^= arr[i];
        }
        return result;

        /*
        Runtime: 0 ms, faster than 100.00% of Java online submissions for XOR Operation in an Array.
Memory Usage: 35.7 MB, less than 64.76% of Java online submissions for XOR Operation in an Array
         */

    }

    public int diagonalSum(int[][] mat) {
        int n = mat.length, res = 0;
        for (int i = 0; i < n; i++) {
            res += mat[i][i]; //Bu yerda har bir index'inchi arrayning arrayIndex'inchidagi elementi dioganal row bo'ladi
            if (i != n - 1 - i) res += mat[i][n - 1 - i]; //Bu yerda o'sha narsaning chappasini qilamiz
        }
        return res;

        /*
        Runtime: 0 ms, faster than 100.00% of Java online submissions for Matrix Diagonal Sum.
Memory Usage: 39.4 MB, less than 41.04% of Java online submissions for Matrix Diagonal Sum.
         */
    }

}

