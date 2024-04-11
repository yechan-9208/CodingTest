class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        StringBuilder sb = new StringBuilder("");
        
        int over_len = overwrite_string.length();
            
        for(int i=0;i<my_string.length();i++){
            
            if(i<s||over_len+s<=i){
                sb.append(my_string.charAt(i));
            }else{
                sb.append(overwrite_string.charAt(i-s));
            }
        }
        
        
        return sb.toString();
    }
}