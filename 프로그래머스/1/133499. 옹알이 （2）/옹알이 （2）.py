## 1. 조카는 4가지 발음 밖에 하지 못함 (4가지 발음 이외 발음은 x)
## 2. 같은 발음을 하지 못함

# def solution(babbling):
    
#     answer=0
#     bab =["aya", "ye", "woo", "ma"]
    
#     for babb in babbling:
#         for b in bab:
#             if babb.count(b) == 1:
#                 babb = babb.replace(b,"")
                
#         if babb=="":
#             answer+=1

#     return answer

def solution(babbling):
    
    answer=0
    bab =["aya", "ye", "woo", "ma"]
    
    for babb in babbling:
        stack=""
        save=""
        for b in babb:
            stack+=b                

            if save==stack:
                break

            if stack in bab:
                save=stack
                stack=""

        if stack=="":
            answer+=1

    return answer
