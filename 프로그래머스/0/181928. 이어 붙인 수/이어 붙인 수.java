class Solution {
    public int solution(int[] num_list) {
        String odd="";
        String even="";
        
        for(int n : num_list){
            if(n%2==0){
                even+=n;
            }else{
                odd+=n;
            }
        }
        return Integer.parseInt(even)+Integer.parseInt(odd);
    }
}