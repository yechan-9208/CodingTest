def solution(s):
    ndict= dict({})
    result=[]
    
    for c in s:
        if not c in ndict:
            ndict[c]=1
            result.append(-1)
            
            for n in ndict:
                if not c == n:
                    ndict[n]+=1
        else:
            result.append(ndict[c])
            
            for n in ndict:
                ndict[n]+=1
                        
            ndict[c]=1

    return result