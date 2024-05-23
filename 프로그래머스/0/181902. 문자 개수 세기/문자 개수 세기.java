class Solution {
    public int[] solution(String my_string) {
        int[] ch = new int[52];
 
        for(char c : my_string.toCharArray()){
            int i =(int)c;
            
            if(i<91){
                ch[i-65]+=1;
            }else{
                ch[i-71]+=1;
            }
        }

        return ch;
    }
}