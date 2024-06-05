import java.util.ArrayList;

class Solution {
    public ArrayList <Integer> solution(int[] arr, boolean[] flag) {
        
        ArrayList <Integer> result = new ArrayList<>();
        
        for(int i=0; i<flag.length;i++){
            int j=0;
            if(flag[i]){
                while(j++<arr[i]*2){
                    result.add(arr[i]);
                }
            }else{
                while(j++<arr[i]){
                    result.remove(result.size()-1);    
                }
            }
        }
        
        return result;
    }
}