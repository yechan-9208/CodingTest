class Solution {
    fun solution(array: IntArray, n: Int): Int {
        var answer: Int = 0
        return array.map{if(it==n) 1 else 0}.sum()
    }
}