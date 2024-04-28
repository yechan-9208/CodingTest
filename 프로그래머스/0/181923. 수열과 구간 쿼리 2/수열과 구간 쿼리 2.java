import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public ArrayList<Integer> solution(int[] arr, int[][] queries) {
        
        ArrayList<Integer> answer = new ArrayList<Integer>();
        for(int[] querie : queries ){
            int[] row_num;
            ArrayList<Integer> ar = new ArrayList<Integer>();
            for(int i=querie[0]; i<=querie[1]; i++){
                if(arr[i]>querie[2]){
                    ar.add(arr[i]);
                }
            }
            if(ar.size()==0){
                answer.add(-1);
            }else{
                answer.add(Collections.min(ar));
            }
                
            
        }
        
        

        return answer;
    }
}