class Solution {
    fun solution(n: Int): Int {
        var f0 : Int = 0
        var f1 : Int = 1
        var sum : Int
        
        for(i in 0..n-2){
            sum = (f0 + f1) % 1234567
            f0 = f1
            f1 = sum
        }
        return f1
    }
}