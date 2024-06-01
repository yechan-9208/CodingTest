import java.util.ArrayList;

class Solution {
    public  ArrayList<String> solution(String[] strArr) {
        
        ArrayList<String> arr = new ArrayList<>();
        
        for(String str:strArr){
            if(!str.contains("ad")){
                arr.add(str);
            }
        }
        return arr;
    }
}