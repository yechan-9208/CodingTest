class Solution {
    fun solution(n: Int): Int {
        var num = n
        var answer = 0
        while(num>0){
            answer+=num%10
            num=num/10
        }
        return answer
    }
}