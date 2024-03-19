def solution(dot):
    zore_one = [1 if i>0 else 0 for i in dot ] 
    zone = [[1,1],[0,1],[0,0],[1,0]]

    for index,z in enumerate(zone):
        if zore_one == z:
            return index+1