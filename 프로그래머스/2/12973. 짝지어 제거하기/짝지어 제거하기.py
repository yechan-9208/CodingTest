from collections import deque
def solution(s):
    
    out_stack=deque(s)
    
    get_stack=deque()
    
    while out_stack:
        num=out_stack.popleft()
        
        if get_stack and get_stack[-1]==num:
            get_stack.pop()
        else:
            get_stack.append(num)

    return 0 if get_stack else 1
    