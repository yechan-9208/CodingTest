import java.util.ArrayList;

class Solution {
    public ArrayList<Integer>  solution(int[] arr) {
        
        ArrayList<Integer> result = new ArrayList<>();
        
        int length=arr.length;
        int resultLen=0;
        
        for(int i=1;i<length;i++){
            if(length<=Math.pow(2,i)){
                resultLen=(int)Math.pow(2,i)-length;
                break;
            }
        }
        
        for(int a :arr){
            result.add(a);
        }
        
        while(resultLen-->0){
            result.add(0);
        }
        
        return result;
    }
}