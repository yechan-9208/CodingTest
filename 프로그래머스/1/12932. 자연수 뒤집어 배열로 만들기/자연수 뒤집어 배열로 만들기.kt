class Solution {
    fun solution(n: Long): IntArray {
        var num = n
        var answer = mutableListOf<Int>()
        while(num>0){
            answer.add((num%10L).toInt())
            num/=10L
        }

        return answer.toIntArray()
    }
}