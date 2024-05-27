import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> two = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==2){
                two.add(i);
            }
        }
        
         ArrayList<Integer> result = new ArrayList<>();
        
        if(two.size()<1){
            result.add(-1);
            return result;
        }
        
        int start= Collections.min(two);
        int end= Collections.max(two);
        
        for(int i = start;i<=end;i++){
            result.add(arr[i]);
        }
        
        return result;
    }
}
