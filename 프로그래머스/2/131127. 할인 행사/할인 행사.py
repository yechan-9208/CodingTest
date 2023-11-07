import copy
def solution(want, number, discount):
    answer = 0
    want_dict=dict()
    for e,i in enumerate(want):
        want_dict[i]=number[e]

    length=sum(number)
    for i in range(0,len(discount)-length+1):
        new_dict = copy.deepcopy(want_dict)
        answer += check_list(new_dict,discount[i:i+10])
    
    return answer


def check_list(new_dict,discount_list):
    for i in discount_list:
        if i in new_dict:
            new_dict[i]-=1
            
    for value in new_dict.values():
        if not(value==0):
            return 0
    else:
        return 1
