class Solution {
    public int solution(String binomial) {
        String[] strSplit = binomial.split(" ");
        int answer = switch(strSplit[1]){
                case "+" -> Integer.valueOf(strSplit[0])+Integer.valueOf(strSplit[2]);
                case "-" -> Integer.valueOf(strSplit[0])-Integer.valueOf(strSplit[2]);
                default -> Integer.valueOf(strSplit[0])*Integer.valueOf(strSplit[2]);
        };
        
        return answer;
    }
}