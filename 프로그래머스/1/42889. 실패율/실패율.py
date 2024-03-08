def solution(N, stages):
    dic = {}
    for i in range(1,N+1):        
        dic[i]=0
        
    acc=0
    len_st=len(stages)
    for i in range(1,N+1):
        i_count=stages.count(i)
        if len_st-acc==0:
            break
        dic[i]=i_count/(len_st-acc)
        acc+=i_count

    result = sorted(dic.items(),key = lambda x: x[1], reverse=True)
    
    answer=[]
    for i in result:
        answer.append(i[0])

    return answer

# def solution(N, stages):
#     dic = {}
#     for i in range(1,N+1):        
#         dic[i]=0
    
#     for stage in stages:
#         if stage in dic:
#             dic[stage]+=1
            
#     acc=0
#     for k,v in dic.items():
#         dic[k]=v/(len(stages)-acc)
#         acc+=v

#     result = sorted(dic.items(),key = lambda x: x[1], reverse=True)
    
#     answer=[]
#     for i in result:
#         answer.append(i[0])

#     return answer