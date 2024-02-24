def solution(k, score):
    
    honer=[]
    answer=[]
    for i in score:
        if len(honer)<k:
            honer.append(i)
        else:
            honer.sort()
            
            if honer[0]<i:
                honer[0]=i
            
            honer.sort()   
            
        answer.append(min(honer))
                
    
        
    return answer