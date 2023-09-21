from collections import deque

def solution(s):

    in_bracket=['[','(','{']
    out_bracket=[']',')','}']
    
    def check_bracket(change_list):
        stack=[]
        
        for element in change_list:

            if element in in_bracket:
                stack.append(element)
                continue

            else:
                a=out_bracket.index(element)
                if stack and (stack[-1]==in_bracket[a]):
                    stack.pop()
                else:
                    return 1

        return len(stack)


    answer = 0
    d=deque(s)
    for i in range(len(d)):
        result=check_bracket(d)
        if(result):
            pass
        else:
            answer+=1
        d.append(d.popleft())


    return answer