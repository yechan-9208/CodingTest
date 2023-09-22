def solution(n, words):
    
    pre_back=words[0][0]
    
    dic={}
    out_index=0
    result=[0,0]

    for i,word in enumerate(words):

        if word[0]==pre_back:
            pre_back=word[-1]
        else:
            out_index=i
            break

        if word in dic:
            out_index=i
            break
        else:
            dic[word]=0
    else:
        return result

    result = out_index%n+1, out_index//n+1
    
    return result