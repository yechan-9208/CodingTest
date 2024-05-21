import java.util.ArrayList;

class Solution {
    public int solution(String my_string, String is_prefix) {
        
        ArrayList<String> arr = new ArrayList<>();
        
        for(int i=0; i<my_string.length();i++){
            arr.add(my_string.substring(0,i));
        }
        
        return arr.contains(is_prefix)? 1:0;
    }
}