class Solution {
    public int[] solution(String myString) {
        String[] split_str=myString.split("x");
        boolean finish= myString.charAt(myString.length()-1)=='x';
        
        int[] answer;
        
        if(finish){
            answer = new int[split_str.length+1];
        }else{
            answer = new int[split_str.length];
        }
            
        for(int i=0;i<split_str.length;i++){
            answer[i]=split_str[i].length();
        }

        return answer;
    }
}