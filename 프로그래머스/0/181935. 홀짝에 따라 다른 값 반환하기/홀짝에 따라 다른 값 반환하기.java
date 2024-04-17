class Solution {
    public int solution(int n) {
        
        int answer = 0;
        
        boolean num = n%2==0? true : false;
        
        for(int i=1; i<=n;i++){
            if(i%2==0 && num){
                answer+=i*i;
            }else if(!num && i%2==1){
                answer+=i;
            }
        }
        
        return answer;
    }
}