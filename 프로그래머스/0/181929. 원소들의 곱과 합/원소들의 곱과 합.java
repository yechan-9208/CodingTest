class Solution {
    public int solution(int[] num_list) {
        int add = 0;
        int mul = 1;
        for(int n :num_list){
            add+=n;
            mul*=n;
        }
        
        return mul< Math.pow(add,2) ? 1 : 0;
    }
}