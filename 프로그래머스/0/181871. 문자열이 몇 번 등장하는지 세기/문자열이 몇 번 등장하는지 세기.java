class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        StringBuilder sb = new StringBuilder(myString);
        
        while(sb.toString().length()>0){
            
            int check=sb.indexOf(pat);
            
            if(check==-1){
                return answer;
            }else{
                answer+=1;
                sb.delete(0, check+1);
            }
        }
        
 
        
        return answer;
    }
}