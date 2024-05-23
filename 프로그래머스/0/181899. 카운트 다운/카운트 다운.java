class Solution {
    public int[] solution(int s, int e) {
        int[] answer = new int[s-e+1];
        for(int i=s,j=0;i>=e;i--,j++)
        {
            answer[j]=i;
        }
        
        return answer;
    }
}