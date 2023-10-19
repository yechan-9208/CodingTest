import math

def solution(n, k):
    
    changed_n=""
    changed_n=change_num(n,k,changed_n)
    a=changed_n.split("0")
    
    b = [ i for i in a if len(i)>0 and check_num(int(i))]
    print(b)
    return len(b)



def change_num(n,k,changed_n):
    while True:
        if n/k>0:
            res=n%k
            n=int(n/k)
            changed_n=str(res)+changed_n
        else:
            break
    return changed_n

def check_num(n):
    if n<=1:
        return 0
    
    for i in range(2, int(math.sqrt(n)) + 1):
        if n%i==0:
            return 0
    else:
        return 1
            

        