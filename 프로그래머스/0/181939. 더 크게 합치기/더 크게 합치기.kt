class Solution {
    fun solution(a: Int, b: Int): Int {
        var answer: Int = 0
        return maxOf((a.toString()+b).toInt(),(b.toString()+a).toInt())
    }
}