import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public ArrayList<String> solution(String my_string) {
        ArrayList<String> list= new ArrayList<>();

        int len = my_string.length();
        
        for(int i =0; i<len;i++){
            list.add(my_string.substring(i,len));
        }
        
        Collections.sort(list);

        return list;
    }
}