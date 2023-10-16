answer=0
def tired(k,cnt,dungeons,check):
    global answer
    answer = max(answer, cnt)
    for i in range(len(dungeons)):
        if check[i]==0 and dungeons[i][0]<=k:
            check[i]=1
            
            tired(k-dungeons[i][1],cnt+1,dungeons,check)
            
            check[i]=0

def solution(k, dungeons):
    check = [0] * len(dungeons)
    global answer
    
    tired(k,0,dungeons,check)
    
    return answer
        
