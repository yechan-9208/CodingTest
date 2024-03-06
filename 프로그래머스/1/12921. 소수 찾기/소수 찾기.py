import math

def solution(n):
    
    arr=[i for i in range(n+1)]
    

    for i in range(2,int(n**(1/2))+1):
        if arr[i]==0:
            continue
        
        for j in range(i*i,n+1,i):
            arr[j]=0

    answer=0
    for r in arr:
        if not r==0:
            answer+=1
            
    
    return answer-1



# import math

# def solution(n):
    
#     answer = 0   
    
#     for in_n in range(2,int(math.sqrt(n))+1):
#         for i in range(2,in_n):
#             if in_n%i==0:
#                 break
#         else:
#             answer+=1
    
            
    
#     return answer