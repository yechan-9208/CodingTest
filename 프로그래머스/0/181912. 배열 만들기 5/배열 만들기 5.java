import java.util.ArrayList;


class Solution {
    public ArrayList<Integer> solution(String[] intStrs, int k, int s, int l) {
        
        ArrayList<Integer> list = new ArrayList();
        
        for(String str: intStrs){
            String cutStr="";
            for(int i=s;i<s+l; i++){
                cutStr+=str.charAt(i);
            }
            int num = Integer.valueOf(cutStr);
            if(k<num) list.add(num);            
        }
        
        return list;
    }
}