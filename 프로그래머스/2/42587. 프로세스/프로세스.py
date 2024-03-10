## priorities : 실행대기 큐 , loaction : 추적해야되는 프로세스 인덱스 번호

# 1. 큐에서 왼쪽 요소를 뽑는다

# 2. 뽑은 요소와 왼쪽에 남아있는 큐들과 우선순위를 비교한다

    # 2-1 우선순위가 더 높은게 있다면 뽑은 요소를 오른쪽에 넣는다.
        # 2-1-1 loaction을 변경해서 프로세스 인덱스 번호를 추적한다.
        
    # 2-2 우선순위가더 높은게 없다면 loaction을 출력한다.

from collections import deque
    
def solution(priorities, location):
    answer = 0
    deq_list = deque(priorities)

    while True:
        pop=deq_list.popleft()

        # 마지막 요소일때
        if len(deq_list)==0:
            return answer+1
    
        
        # 2번에 해당
        if pop<max(deq_list):
            deq_list.append(pop)
        elif pop>=max(deq_list) and location==0:
            answer+=1
            return answer
        elif pop>=max(deq_list) :
            answer+=1
                    
        # 위치 추적
        if location==0:
            location=len(deq_list)-1
        else:
            location-=1 
            
 
