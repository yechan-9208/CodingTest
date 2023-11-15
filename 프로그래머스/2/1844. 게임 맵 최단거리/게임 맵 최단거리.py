from collections import deque
def solution(maps):

    dc=[-1, 1, 0, 0]
    dr=[0, 0, -1, 1]

    
    
    def bfs(c,r):
        line= deque()
        line.append([c,r])

        while line:
            c,r=line.popleft()

            for i in range(4):
                nc=c+dc[i]
                nr=r+dr[i]

                if nc<0 or nc>=len(maps) or nr<0  or nr>=len(maps[0]):
                    continue

                if maps[nc][nr]==0:
                    continue

                if maps[nc][nr]==1:
                    maps[nc][nr]=maps[c][r]+1
                    line.append([nc,nr])

        return maps[len(maps)-1][len(maps[0])-1]

    answer=bfs(0,0)

    return -1 if answer==1 else answer