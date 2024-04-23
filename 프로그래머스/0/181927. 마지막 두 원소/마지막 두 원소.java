import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(int[] num_list) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        for(int num: num_list){
            answer.add(num);
        }
        
        int len=num_list.length;
        if (num_list[len-1]>num_list[len-2]){
            answer.add(num_list[len-1]-num_list[len-2]);
        }else{
            answer.add(num_list[len-1]*2);
        }

        return answer;
    }
}