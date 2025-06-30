class Solution {
    fun solution(array: IntArray): Int {
        array.sort()
        
        return array.get(array.size/2)
    }
}