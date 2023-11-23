def solution(d, budget):
    d.sort()
    d_sum=0
    for e,i in enumerate(d):
        d_sum+=i
        if budget<d_sum:
            return e
    else:
        return len(d)
