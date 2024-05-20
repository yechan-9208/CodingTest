class Solution {
    public String solution(String my_string, int n) {
        int len = my_string.length();
        String subString = my_string.substring(len-n,len);
        return subString;
    }
}