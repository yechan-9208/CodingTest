import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        switch(n){
            case 1:
                return Arrays.copyOfRange(num_list,0,slicer[1]+1);
            case 2:
                return Arrays.copyOfRange(num_list,slicer[0],num_list.length);
            case 3:
                return Arrays.copyOfRange(num_list,slicer[0],slicer[1]+1);
            default:
                ArrayList<Integer> arr = new ArrayList<>();
                for(int i=slicer[0];i<=slicer[1];i+=slicer[2]){
                    arr.add(num_list[i]);
                }
                
                int[] result = new int[arr.size()];
                for(int i=0; i<arr.size();i++){
                    result[i]=arr.get(i);
                }
                return result;
                
        }
    }
}