def solution(name, yearning, photo):
    
    dic={}
    for i,n in enumerate(name):
        dic[n]=yearning[i]
    

    result=[]
    for p_list in photo:
        num=0
        
        for in_p in p_list:
            if in_p in dic:
                num+=dic[in_p]

        result.append(num)    
            
    return result