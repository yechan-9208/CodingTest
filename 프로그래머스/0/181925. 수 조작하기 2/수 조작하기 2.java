class Solution {
    public String solution(int[] numLog) {
        
        String answer = "";
        int initial=0;

        for(int num:numLog){
            int change = num-initial;
            initial=num;
            switch(change){
                case 1: answer+="w"; break;
                case -1: answer+="s"; break;
                case 10: answer+="d"; break;
                case -10: answer+="a"; break;
            }
        }
        return answer;
    }
}