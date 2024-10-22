import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int num : nums){
            if(!map.containsKey(num)){
                map.put(num,1);
            }
        }
        
        int answer = Math.min(map.size(),nums.length/2);
        
        return answer;
    }
}