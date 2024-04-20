class Solution {
    public String solution(String code) {
        boolean mode=false;
        String ret="";
        for(int i=0; i<code.length(); i++){
            
            char c = code.charAt(i);
            
            if (c=='1'){
                mode =!mode;
                continue;
            }
            
            if(!mode && i%2==0){
                ret+=c;
            }else if(mode && i%2==1){
                ret+=c;
            }
        }
        if (ret.length()==0)
            return "EMPTY";
        return ret;
    }
}