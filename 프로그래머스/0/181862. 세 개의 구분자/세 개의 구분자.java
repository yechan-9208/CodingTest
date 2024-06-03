import java.util.ArrayList;

class Solution {
    public ArrayList<String> solution(String myStr) {
        String[] answer = myStr.split("a|b|c");
        ArrayList<String> arr = new ArrayList<>();
        
        for(String a:answer){
            if(!a.equals("")){
                arr.add(a);
            }
        }
        
        if(arr.size()>0){
            return arr;
        }else{
            arr.add("EMPTY");
            return arr;
        }
        
    }
}