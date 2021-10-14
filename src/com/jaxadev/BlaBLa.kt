package com.jaxadev

class BlaBLa {

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

}