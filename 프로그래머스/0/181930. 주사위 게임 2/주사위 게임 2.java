class Solution {
    public int solution(int a, int b, int c) {
        int default_num=a+b+c;
        if(a==b && b==c && a==c){
            return  default_num*pow(a,b,c,2)*pow(a,b,c,3);
        }else if(a!=b && b!=c && a!=c){
            return default_num;
        } else
            return default_num*pow(a,b,c,2);
    }
    
    private int pow(int a, int b, int c, int num){
    
        return (int)Math.pow(a,num)+(int)Math.pow(b,num)+(int)Math.pow(c,num);
    }
}