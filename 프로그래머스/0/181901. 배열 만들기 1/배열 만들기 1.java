class Solution {
    public int[] solution(int n, int k) {
        int[] answer = new int[n/k];
        int i=0;
        for(int no : answer) answer[i++]=i*k;
        
        return answer;
    }
}