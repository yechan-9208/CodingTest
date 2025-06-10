class Solution {
    fun solution(n: Long): IntArray {
        var num = n
        var answer = mutableListOf<Long>()
        while(num>0){
            answer.add(num%10L)
            num/=10L
        }
        

        return answer.map{it.toInt()}.toIntArray()
    }
}