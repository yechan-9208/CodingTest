class Solution {
    fun solution(num: Int): Int {
        var n = num
        var answer: Int = 0
        while(n>0){
            answer+=n%10
            n/=10
        }
        return answer
    }
}