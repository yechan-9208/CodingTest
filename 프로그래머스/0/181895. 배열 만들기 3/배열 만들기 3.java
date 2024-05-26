import java.util.ArrayList;
class Solution {
    public  ArrayList<Integer> solution(int[] arr, int[][] intervals) {
        ArrayList<Integer> result = new ArrayList<>();
        for(int[] interval:intervals){
            for(int i=interval[0];i<=interval[1];i++){
                result.add(arr[i]);
            }
        }
        return result;
    }
}