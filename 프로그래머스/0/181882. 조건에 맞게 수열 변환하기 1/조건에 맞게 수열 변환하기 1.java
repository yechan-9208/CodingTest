class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length];
        for(int i=0; i<arr.length;i++){
            int e=arr[i];
            if(e>=50 & e%2==0){
                answer[i]=e/2;
            }else if(e<50 & e%2==1){
                answer[i]=e*2;
            }else{
                answer[i]=e;
            }
        }
        return answer;
    }
}