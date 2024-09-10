class Solution {
    fun solution(my_string: String, overwrite_string: String, s: Int): String {
        var length = overwrite_string.length
        var newString = my_string.substring(0,s)+overwrite_string+my_string.substring(s+length)
        
        
        return newString
    }
}