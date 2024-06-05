import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, int k) {

        List<Integer> uniqueList = new ArrayList<>();
        
        for (int a : arr) {
            if (uniqueList.size() == k) {
                break;
            }
            if (!uniqueList.contains(a)) {
                uniqueList.add(a);
            }
        }
        
        int[] result = new int[k];
        int i = 0;
        
        for (int num : uniqueList) {
            result[i++] = num;
        }
        
        Arrays.fill(result, i, k, -1);
        
        return result;
    }
}