import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(int n, int[] numlist) {
        
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int num : numlist){
            if(num%n==0){
                arr.add(num);
            }
        }
        
        return arr;
    }
}