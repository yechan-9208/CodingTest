class Solution {
    public int solution(int number, int n, int m) {
        
        boolean answer_n = (number % n == 0) ? true : false;
        boolean answer_m = (number % m == 0) ? true: false;
           
        if (answer_n && answer_m)
            return 1;
        else
            return 0;
        
    }
}