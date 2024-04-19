class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = a;
        int sum=0;
        for(boolean b : included){
            sum = b ? sum+answer : sum;
            answer+=d;
        }
        
        return sum;
    }
}