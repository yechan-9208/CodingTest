
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(int a, int b, int c, int d) {
        Map<Integer, Integer> map = new HashMap<>();
        
        int[] arr = {a,b,c,d};
        int count=0;
        for(int n: arr){
            if(map.containsKey(n)){ 
                int key = map.get(n);
                map.put(n,key+1);
            }else{
                map.put(n,1);
                count+=1;
            }
        }
                
        int answer = 0;
        int [] num= new int[2];
        int i=0;
        
        switch(map.size())
        {
            case 1:
                answer=1111*a;
                break;
            case 2:
                if(map.containsValue(2)){
                    for (Integer key : map.keySet()) {
                        num[i++]=key;
                    }
                    answer=(num[0]+num[1])*Math.abs(num[0]-num[1]);
                }else{
                    for (Integer key : map.keySet()) {
                        if(map.get(key)==3){
                            num[i]=key;
                        }else{
                            num[i+1]=key;
                        }
                    }
                    answer=(int)Math.pow(10*num[0]+num[1],2);
                }
                break;
            case 3:
                for(Integer key : map.keySet()){
                    if(map.get(key)==1){
                        num[i++]=key;
                    }
                }
                answer=num[0]*num[1];
                break;
                
            default:
                int min=7;
                for(int j: arr){
                    if(j<min) {
                        min=j;
                    }
                }
                answer=min;                
                break;
        }
        
        

        return answer;
    }
}