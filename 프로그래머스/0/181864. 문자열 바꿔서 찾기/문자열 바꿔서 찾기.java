class Solution {
    public int solution(String myString, String pat) {
        String newPat="";
        for(char p:pat.toCharArray()){
            newPat+=p=='A'?'B':'A';
        }
            
        return myString.contains(newPat)?1:0;
    }
}