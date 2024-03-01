from collections import deque

def change_index(empty_q,city):
    
    new_q=deque()
    for q in empty_q:
        if q == city:
            pass
        else:
            new_q.append(q)
    
    new_q.append(city)
    
    return new_q


def solution(cacheSize, cities):
    
    if cacheSize==0:
        return len(cities)*5
    
    empty_q=deque([0 for _ in range(cacheSize)])
    
    result=0
    for city in cities:
        city=city.lower()
        
        if city in empty_q:
            result+=1
            empty_q = change_index(empty_q,city)
  
        else:
            result+=5
            empty_q.popleft()
            empty_q.append(city) 
  
    
    return result