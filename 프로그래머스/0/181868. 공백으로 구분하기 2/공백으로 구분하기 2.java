import java.util.ArrayList;
class Solution {
    public ArrayList<String> solution(String my_string) {
        String[] answer = my_string.split(" ");
        
        ArrayList<String> arr = new ArrayList<>();
        
        for(String str:answer){
            if(!str.equals("")){
                arr.add(str);
            }
        }
        
        return arr;
    }
}