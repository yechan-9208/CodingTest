from collections import deque

def solution(dartResult):

    count=[0,0,0]
    dic = {'S':1,'D':2,'T':3}
    dart = deque(dartResult)
    
    for i in range(3):
        
        number=""
        number += dart.popleft()
        
        if dart[0].isdigit():
            number+=dart.popleft()
            
        bouns = dart.popleft()
        
        count[i]=pow(int(number),dic[bouns])
        
        if len(dart)==0:
            break
        
        if dart[0]== '*':
            dart.popleft()
    
            if i==0:
                count[i]*=2
            else:
                count[i-1]*=2
                count[i]*=2
               
        elif dart[0] == '#':
            dart.popleft()
            count[i]*=-1

    return sum(count)