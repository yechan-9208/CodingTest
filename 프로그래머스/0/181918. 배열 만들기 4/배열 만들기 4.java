import java.util.ArrayList;
class Solution {
    public ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> arrList = new ArrayList<>();
        
            
        for(int i=0; i<arr.length; i++)
        {
            if(arrList.size()==0){
                arrList.add(arr[i]);
            }
            else{
                int last_num = arrList.get(arrList.size()-1);
                if(last_num<arr[i]){
                    arrList.add(arr[i]);
                }else{
                    arrList.remove(arrList.size()-1);
                    i--;
                }
            }
        }
        return arrList;
    }
}