class Solution {
    fun solution(n: Int): Array<IntArray> {
        val arr = arrayOf(1, 2, 3)
        val answer = mutableListOf<IntArray>()
        return move(n, 1, 3, arr, answer).toTypedArray()
    }
    
    fun move(n: Int, cp: Int, tp: Int, arr: Array<Int>, answer: MutableList<IntArray>): MutableList<IntArray> {
        if (n == 1) {
            answer.add(intArrayOf(cp, tp))
        } else {
            val nextTp = arr.first { it != cp && it != tp }
            move(n - 1, cp, nextTp, arr, answer)
            answer.add(intArrayOf(cp, tp))
            move(n - 1, nextTp, tp, arr, answer)
        }
        return answer
    }
}