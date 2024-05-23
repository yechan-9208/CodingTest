import java.util.Arrays;


class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        char[] chr=my_string.toCharArray();
        
        for(int index:indices){
            chr[index]='_';
        }
        
        for(char c : chr){
            if(!(c=='_')){
                answer+=c;
            }
        }
        
        return answer;
    }
}