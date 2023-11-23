def change_3jin(n):
    result=""
    while n>0:
        result=str(n%3)+result
        n=n//3
    return result

def change_10jin(n):
    up3_num=1
    result=0
    for in_n in n:
        result+=up3_num*int(in_n)
        up3_num*=3
    
    return result

def solution(n):
    num10to3=change_3jin(n)
    answer = change_10jin(num10to3)
    return answer


