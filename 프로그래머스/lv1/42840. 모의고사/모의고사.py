def solution(answers):
    num_dic = {"1":[1,2,3,4,5],'2':[2,1,2,3,2,4,2,5],'3':[3,3,1,1,2,2,4,4,5,5]}
    length= len(answers)
    count = [0]*3
    for e1,i in enumerate(num_dic.values()):
        repeat = int((length-1)/len(i))+1
        check = i * repeat

        for e2,n in enumerate(answers):
            if n== check[e2]:
                count[e1]+=1
    
    answer = [e+1 for e,i in enumerate(count) if i==max(count)]
    return answer