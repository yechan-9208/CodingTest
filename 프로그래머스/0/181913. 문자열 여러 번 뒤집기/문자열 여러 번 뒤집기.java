class Solution {
    public String solution(String my_string, int[][] queries) {
        for(int[] query:queries){
            String start=my_string.substring(0,query[0]);
            String mid=my_string.substring(query[0],query[1]+1);
            String reversed = new StringBuilder(mid).reverse().toString();
            String end=my_string.substring(query[1]+1,my_string.length());
            
            my_string=start+reversed+end;
        }
        
        return my_string;
    }
}