def solution(sides):
    sides.sort()
    big_num=sides[-1]
    
    if sum(sides)-big_num*2>0:
        return 1
    else:
        return 2
