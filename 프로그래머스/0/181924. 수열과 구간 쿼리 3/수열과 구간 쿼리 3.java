import java.util.ArrayList;
class Solution {
    public ArrayList<Integer> solution(int[] arr, int[][] queries) {
        
        ArrayList<Integer> ar = new ArrayList<>();
        
        for(int n : arr){
            ar.add(n);
        }
        
        for(int[] que : queries){
            int swap1 = ar.get(que[0]);
            int swap2 = ar.get(que[1]);
            ar.set(que[0],swap2);
            ar.set(que[1],swap1);
        }
        
        return ar;
    }
}