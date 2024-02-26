from collections import deque

def solution(cards1, cards2, goal):
    
    c1=deque(cards1)
    c2=deque(cards2)
    g=deque(goal)
    
    while len(g)>0:
        if len(c1)>0 and c1[0]==g[0]:
            c1.popleft()
            g.popleft()
        elif len(c2)>0 and c2[0]==g[0]:
            c2.popleft()
            g.popleft()
        else:
            return "No"
    return "Yes"
    