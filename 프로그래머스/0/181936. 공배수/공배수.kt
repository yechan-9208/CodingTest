class Solution {
    fun solution(number: Int, n: Int, m: Int): Int {
        var answer: Int = 0
        if(number%n+number%m==0){
            answer=1    
        }
        return answer
    }
}