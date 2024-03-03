def solution(number, limit, power):
    
    num_li=[]
    for i in range(1,number+1):
        result=0
        for j in range(1, int(i**(1/2))+1):
            if i%j==0:
                result+=1
                if j**2 !=i:
                    result+=1
            if result>limit:
                result=power
                break
        num_li.append(result)


    return sum(num_li)
    


# def my_num(number):
            
#     result=0
    
#     for i in range(1,int(number**(1/2))+1):
#         if number%i == 0:
#             result+=1
#             if number**2 != i:                 
#                     result += 1

#     return result
    

# def solution(number, limit, power):
    
#     num_li=[]
#     for i in range(1,number+1):
#         num_li.append(my_num(i))
    
#     answer = 0
#     print(num_li)
#     for num in num_li:
#         if num<=limit:
#             answer+=num
#         else:
#             answer+=power
    
#     return answer