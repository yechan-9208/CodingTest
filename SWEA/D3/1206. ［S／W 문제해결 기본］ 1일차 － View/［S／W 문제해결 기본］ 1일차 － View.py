from collections import deque
for i in range(1,11):
    new_deque=deque([0,0])
    T = int(input())
    nums=list(map(int,input().split()))
    count=0
    for n in range(len(nums)+2):
        if n<3:
            new_deque.append(nums[n])    
        else:
            max_n=new_deque[2]
            new2_list =list(new_deque)[0:2]+list(new_deque)[3:5]
            if max_n>max(new2_list):
                count+=max_n-max(new2_list)
            if n>=len(nums):
                break
                new_deque.append(0)
            else:
                new_deque.append(nums[n])
            new_deque.popleft()
    print(f"#{i} {count}")