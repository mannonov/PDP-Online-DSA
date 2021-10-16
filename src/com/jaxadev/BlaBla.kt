package com.jaxadev

import java.util.*

class BlaBla {

    fun countPrimes(n: Int): Int {
        val seen = BooleanArray(n)
        var ans = 0
        for (num in 2 until n) {
            if (seen[num]) continue
            ans += 1
            var mult = num.toLong() * num
            while (mult < n) {
                seen[mult.toInt()] = true
                mult += num.toLong()
            }
        }
        return ans
    }

    fun isAnagram(s: String, t: String): Boolean {

        if (s.length != t.length) {
            return false
        }

        val strArray1 = s.toCharArray()
        val strArray2 = t.toCharArray()

        Arrays.sort(strArray1)
        Arrays.sort(strArray2)

        val sortedStr1 = String(strArray1)
        val sortedStr2 = String(strArray2)

        return sortedStr1 == sortedStr2

        /*
        Runtime: 201 ms, faster than 66.56% of Kotlin online submissions for Valid Anagram.
    Memory Usage: 41.2 MB, less than 17.20% of Kotlin online submissions for Valid Anagram.
         */
    }

}