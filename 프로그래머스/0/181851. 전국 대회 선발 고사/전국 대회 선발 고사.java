import java.util.ArrayList;
import java.util.List;
class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        
        
        ArrayList<Integer> check = new ArrayList<>();
        
        
        for(int j=0;j<3;j++){
            int min=101;
            int minIndex=0;
            for(int i=0; i<rank.length;i++){
                if(attendance[i] && rank[i]<min && !check.contains(i)){
                    min=rank[i];
                    minIndex=i;
                }
            }
            check.add(minIndex);
        }
    
        
        int answer = 10000*check.get(0)+100*check.get(1)+check.get(2);
        return answer;
    }
}