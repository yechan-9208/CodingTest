class Solution {
    public String solution(String my_string, int s, int e) {
        String start = my_string.substring(0,s);
        String mid = my_string.substring(s,e+1);
        String midReverse = new StringBuilder(mid).reverse().toString();
        String end = my_string.substring(e+1);
        
        return start+midReverse+end;
    }
}