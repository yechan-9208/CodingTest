class Solution {
    public String solution(String my_string) {
        String answer = "";
        for(char st:my_string.toCharArray()){
            if(Character.isLowerCase(st)){
                answer+=Character.toUpperCase(st);
            }else{
                answer+=Character.toLowerCase(st);
            }
        }
        
        return answer;
    }
}