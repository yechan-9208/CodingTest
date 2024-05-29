class Solution {
    public int solution(String myString, String pat) {
        
        if(myString.toLowerCase().contains(pat.toLowerCase())==true){
            return 1;
        }
        return 0;
    }
}