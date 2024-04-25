import java.util.HashMap;

class Solution {
    public int solution(int n, String control) {
    
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('w', 1);
        map.put('s', -1);
        map.put('d', 10);
        map.put('a', -10);
        
        for(char s : control.toCharArray()){
            n+=map.get(s);
        }
        
        return n;
    }
}