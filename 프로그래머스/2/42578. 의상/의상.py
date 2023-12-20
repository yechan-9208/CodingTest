import math
def solution(clothes):
    clothe_kind=dict()

    for clothe in clothes:
        if not(clothe[1] in clothe_kind):
            clothe_kind[clothe[1]]=1
        else:
            clothe_kind[clothe[1]]+=1

    result=1
    for i in clothe_kind.values():
        result*=i+1

    return result-1