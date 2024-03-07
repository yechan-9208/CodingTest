from collections import deque
def solution(n, m, section):

    
    sec_d=deque(section)
    
    answer=0
    
    while len(sec_d)>0:
        first_pop=sec_d.popleft()+m-1
        while len(sec_d)>0 and sec_d[0]<=first_pop:
            sec_d.popleft()

        answer+=1

    return answer