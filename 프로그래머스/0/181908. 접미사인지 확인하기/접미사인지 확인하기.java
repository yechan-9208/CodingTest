class Solution {
    public int solution(String my_string, String is_suffix) {
        
        int len = my_string.length();
        String[] arr= new String[len];
        
        for(int i=0; i<len;i++){
            arr[i]=my_string.substring(i);
        }
        
        int result=0;
        for(String str:arr){
            System.out.print(str);
            if(str.equals(is_suffix)){
                result=1;
            }
        }

        return result;
    }
}