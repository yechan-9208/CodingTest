def solution(n, left, right):
    answer = []
        
    # for start_number in range(1,n+1):
    #     for count_n in range(n):
    #         if count_n>start_number-1:
    #             start_number+=1
    #         answer.append(start_number)
    
    for number in range(left+1,right+2):
        min_n = int((number-1)/n)+1
        count= number%n
            
        if count==0:
            answer.append(n)
        elif count > min_n:
            answer.append(count)
        else:
            answer.append(min_n)
            
    return answer