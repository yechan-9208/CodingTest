import java.util.HashMap;

class Solution {
    public int solution(String[] strArr) {
        HashMap<Integer,Integer> map =  new HashMap<>();
        for(String str:strArr){
            int len = str.length();
            if(map.containsKey(len)){
                map.put(len,map.get(len)+1);
            }else{
                map.put(len,1);
            }
        }
        int maxValue=0;
        
        for (int value : map.values()) {
            if (value > maxValue) {
                maxValue = value;
            }
        }

        return maxValue;
    }
}