import java.util.ArrayList;
class Solution {
    public ArrayList <Integer> solution(int[] arr) {
        ArrayList <Integer> arr2 = new ArrayList<>();
        for(int a:arr){
            for(int i=1; i<=a;i++){
                arr2.add(a);
            }
        }
        return arr2;
    }
}