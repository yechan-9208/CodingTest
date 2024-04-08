# 1. 첫번째 글자를 읽는다.
# 2. 첫번째 글자를 기억하고 다음 글자를 읽는다.
# 3-1. 다음글자가 첫번째 글자와 같다면 첫번째 글자 카운트를 높인다.
# 3-2. 다음글자가 첫번째 글자와 같지않고 첫번째 글자가 나온 횟수와 여태나온 다른 글자의 수가 같다면 분할을한다.

def solution(s):
    result=0
    
    split_string=""
    frist_c=0
    other_c=0
    for i in s:
        split_string+=i
        
        if(len(split_string)==1):
            frist_c+=1
        else:
            if split_string[0]==i:
                frist_c+=1
            else:
                other_c+=1
                
        if frist_c==other_c:
            frist_c=0
            other_c=0
            split_string=""
            result+=1
            
    if len(split_string)>0:
        return result+1

    return result