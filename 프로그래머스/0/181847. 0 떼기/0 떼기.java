import java.util.ArrayList;

class Solution {
    public String solution(String n_str) {
        ArrayList<Character> arr = new ArrayList<>();
        
        boolean isFisrtCheck=false;
        for(char str:n_str.toCharArray()){
            if(isFisrtCheck){
                arr.add(str);
            }else{
                if(str!='0'){
                    isFisrtCheck=true;
                    arr.add(str);
                }    
            }
        }
        
        String answer = "";
        
        for(char a:arr){
            answer+=a;
        }
        
        return answer;
    }
}