class Solution {
    public int solution(int[] date1, int[] date2) {
        int result=0;
        for(int i=0;i<date1.length;i++){
            if(date1[i]<date2[i]){
                result=1;
                break;
            }else if(date1[i]>date2[i]){
                break;
            }
        }
        return result;
    }
}