import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        
        for(int i=0; i<arr.length;i++)
            if(result.size()==0){
                result.add(arr[i]);
            }else{
                int reSize=result.size()-1;
                if(arr[i]==result.get(reSize)){
                    result.remove(reSize);
                }else{
                    result.add(arr[i]);
                }
            }
        if(result.size()==0){
            result.add(-1);
        }
            
        return result;
        }
    }