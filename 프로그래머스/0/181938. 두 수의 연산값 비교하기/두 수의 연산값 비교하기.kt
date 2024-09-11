class Solution {
    fun solution(a: Int, b: Int): Int {
        var answer: Int = 0
        return maxOf((""+a+b).toInt(),2*a*b)
    }
}