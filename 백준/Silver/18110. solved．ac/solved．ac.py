from collections import deque
import sys

Eps=0.000001
input_case=int(input())

if input_case==0:
    print(0)
else:
    arr=[]

    for i in range(input_case):
        # arr.append(int(input()))
        arr.append(int(sys.stdin.readline().strip()))

    arr.sort()

    deque_arr=deque(arr)

    count_15per=round(len(deque_arr)*0.15+Eps)

    for i in range(count_15per):
        deque_arr.pop()
        deque_arr.popleft()

    result=round(sum(deque_arr)/len(deque_arr)+Eps)
    sys.stdout.write(str(result))
