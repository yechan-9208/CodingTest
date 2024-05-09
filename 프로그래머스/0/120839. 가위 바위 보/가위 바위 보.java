class Solution {
    public String solution(String rsp) {
        String answer = ""; 
        for(char r : rsp.toCharArray()) { 
            switch(r){
                case '0':
                    answer+="5";
                    break;
                case '2':
                    answer+="0";
                    break;
                default:
                    answer+="2";
                    break;
            }
        }
        return answer;
    }
}