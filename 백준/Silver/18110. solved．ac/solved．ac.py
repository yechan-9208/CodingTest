from collections import deque
import sys


def round_num(num):
    num_str=str(num)
    num_arr=num_str.split('.')

    if int(num_arr[1][0])>4:
        return int(num_arr[0])+1
    else:
        return int(num_arr[0])
    
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

    count_15per=round_num(len(deque_arr)*0.15)

    for i in range(count_15per):
        deque_arr.pop()
        deque_arr.popleft()

    result=round_num(sum(deque_arr)/len(deque_arr))
    sys.stdout.write(str(result))