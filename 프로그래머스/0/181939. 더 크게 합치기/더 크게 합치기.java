class Solution {
    public int solution(int a, int b) {
        String a_b = ""+a+b;
        String b_a = String.valueOf(b)+String.valueOf(a);
        
        int a_b_i = Integer.parseInt(a_b);
        int b_a_i = Integer.parseInt(b_a);
        
        int answer = Math.max(a_b_i,b_a_i);
        
        return answer;
    }
}