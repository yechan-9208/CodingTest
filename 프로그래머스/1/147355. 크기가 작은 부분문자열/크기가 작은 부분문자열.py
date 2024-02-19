from collections import deque

def solution(t, p):
    t=deque(t)
    save=""
    result=0
    for i in range(len(p)-1):
        save+=t.popleft()
    
    while len(t)>0:
        save+=t.popleft()
        if save<=p:
            result+=1
        save=save[1:]

    return result
