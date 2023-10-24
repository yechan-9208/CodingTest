def solution(record):
    EL_list=[]
    C_list={}
    
    answer=[]
    
    for active in record:        
        if active[0]=="C" or active[0]=="E":
            in_active = active.split(" ")
            C_list[in_active[1]]=in_active[2]

    for active in record:
        in_active = active.split(" ")
        if active[0]=="E":
            answer.append(f"{C_list[in_active[1]]}님이 들어왔습니다.")
        elif active[0]=="L":
            answer.append(f"{C_list[in_active[1]]}님이 나갔습니다.")    
    return answer



# def solution(record):
#     EL_list=[]
#     C_list={}
#     for active in record:
#         if active[0]=="C":
#             C_num=active.split(' ')
#             C_list[C_num[1]]=C_num[2]
#         else:
#             EL_list.append(active)
    
        
#     for e,EL in enumerate(EL_list):
#         EL_num=EL.split(' ')
#         if EL_num[1] in C_list:
#             change_EL_list =EL_num[:2]
#             change_EL_list.append(C_list[EL_num[1]])
#             EL_list[e]= " ".join(change_EL_list)
        
    
#     C_list2={}
#     for e,EL in enumerate(EL_list):
#         EL_num=EL.split(' ')
#         if len(EL_num)==3:
#             C_list2[EL_num[1]]=EL_num[2]

#     answer = []
#     for result in EL_list:
#         real_result = result.split(" ")
#         if result[0]=="E":
#             if(real_result[1] in C_list2):
#                 answer.append(f"{C_list2[real_result[1]]}님이 들어왔습니다.")
#             else:
#                 answer.append(f"{real_result[1]}님이 들어왔습니다.")
#         else:
#             answer.append(f"{C_list2[real_result[1]]}님이 나갔습니다.")
    
#     return answer