from collections import deque

def solution(people, limit):
    
    people.sort()
    d = deque(people)
    count=0
    
    while not(len(d)==0):
        if d[0]+d[-1]<=limit and len(d)>1:
            d.pop()
            d.popleft()
        else:
            d.pop()
        count+=1
    
    return count



