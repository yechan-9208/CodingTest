def solution(lottos, win_nums):

    rank = {6:1,5:2,4:3,3:4,2:5,1:6,0:6}
    
    count=0
    for lotto in lottos:
        if lotto in win_nums:
            count+=1
    
    
      
    min_rank = rank[count]
    max_rank = rank[count + lottos.count(0)]
    
    answer = [max_rank,min_rank]
    return answer