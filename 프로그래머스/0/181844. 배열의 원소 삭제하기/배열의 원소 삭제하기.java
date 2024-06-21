import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> result = new ArrayList<>();
        for(int a : arr){
            boolean check=true;
            for(int d:delete_list){
                if(a==d){
                    check=false;
                    break;
                }
            }
            if(check){
                result.add(a);
            }
        }
  
        return result;
    }
}