class Solution {
    public int solution(int a, int b) {
        int a_b = Integer.parseInt(""+a+b);
        int a_b2 = 2*a*b;
        
        int answer = Math.max(a_b,a_b2);
        
        return answer;
    }
}