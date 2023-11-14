count=0
def dfs(index,numbers,target,current_sum):
    global count
    index+=1
        
    if index==len(numbers):
        if current_sum == target:
            count+=1   
        return

    dfs(index,numbers,target,current_sum+numbers[index])
    dfs(index,numbers,target,current_sum-numbers[index])
    

def solution(numbers, target):
    dfs(0,numbers,target,numbers[0])
    dfs(0,numbers,target,-numbers[0])
    return count


# def solution(numbers, target):
#     answer = 0
#     chance = pow(2,len(numbers))
    
#     for num in range(chance):
#         # answer+=make_sum(num,target,numbers)
#         answer+=make_sum(num,target,numbers)

    
    
#     return answer

# from collections import deque
# def make_sum(number,target,numbers):
#     sum_n=0
#     bin_num = bin(number)
#     bin_list = deque(bin_num[2:])
    
#     while len(bin_list)<len(numbers):
#         bin_list.appendleft("0")
  
#     for n in range(len(numbers)): # 0 1 2 3 4 
#         if bin_list[n]=="0": 
#             sum_n+=int(numbers[n])
#         else:
#             sum_n-=int(numbers[n])
            
#     if target==sum_n:
#         return 1
#     else:
#         return 0
    
    
    

