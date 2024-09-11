class Solution {
    fun solution(ineq: String, eq: String, n: Int, m: Int): Int {
        var answer: Int = 0
        var isRight: Boolean=false
        var condition : String =""
        condition=ineq+eq
        when(condition){
            ">=" -> isRight = n>=m
            "<=" -> isRight = n<=m
            ">!" -> isRight = n>m
            "<!" -> isRight = n<m
        }
        
        if(isRight){
            answer=1
        }
        return answer
    }
}