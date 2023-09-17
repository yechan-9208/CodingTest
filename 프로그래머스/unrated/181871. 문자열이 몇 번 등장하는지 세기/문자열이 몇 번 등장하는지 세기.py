def solution(myString, pat):
    result=0

    while pat in myString:
        a=myString.index(pat)
        myString =myString[a+1:]
        result+=1
    
    return result