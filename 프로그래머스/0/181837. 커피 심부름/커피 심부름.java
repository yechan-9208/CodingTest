class Solution {
    public int solution(String[] order) {
        int answer = 0;
        for(String o:order){
            if(o.contains("ame")){
                answer+=4500;
            }else if(o.contains("cafe")){
                answer+=5000;
            }else{
                answer+=4500;
            }
        }
        
        return answer;
    }
}