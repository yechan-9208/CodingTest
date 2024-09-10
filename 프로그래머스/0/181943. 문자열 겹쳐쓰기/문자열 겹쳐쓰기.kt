class Solution {
    fun solution(my_string: String, overwrite_string: String, s: Int): String {
        var answer: String = ""
        
        for(i in 0..s-1){
            answer+=my_string[i]
        }
        
        for(c in overwrite_string){
            answer+=c
        }
        
        for(i in overwrite_string.length+s..my_string.length-1){
            answer+=my_string[i]
        }
       	
        
        return answer
    }
}