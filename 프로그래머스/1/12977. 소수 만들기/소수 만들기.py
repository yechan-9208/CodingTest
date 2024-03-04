import itertools

def solution(nums):
    answer = -1
        
    comb= itertools.combinations(nums,3)
    
    result=0
    
    for c in comb:
        num=sum(c)
        for i in range(2,num):
            if num%i==0:
                break
        else:
            result+=1
                

    return result