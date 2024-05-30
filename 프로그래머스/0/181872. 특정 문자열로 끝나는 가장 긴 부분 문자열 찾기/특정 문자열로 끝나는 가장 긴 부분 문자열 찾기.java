class Solution {
    public String solution(String myString, String pat) {
        
        StringBuilder sb1 = new StringBuilder(myString);
        StringBuilder sb2 = new StringBuilder();
        
        while(!sb2.toString().contains(pat)){
            sb2.append(sb1.charAt(0));
            sb1.deleteCharAt(0); 
        }
        
        while(sb1.length()>0 & sb1.toString().contains(pat)){
            sb2.append(sb1.charAt(0));
            sb1.deleteCharAt(0); 
        }

        return sb2.toString();
    }
}