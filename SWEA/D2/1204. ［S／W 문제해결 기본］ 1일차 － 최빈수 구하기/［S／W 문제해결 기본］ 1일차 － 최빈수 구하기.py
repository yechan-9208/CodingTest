from collections import Counter

T = int(input())
for test_case in range(1, T + 1):
	case =int(input())
	arr=list(map(int,input().split()))
	arr_c=Counter(arr)
	max_v=max(arr_c.values())
	result=[k for k,v in arr_c.items() if v==max_v]
	print(f"#{test_case} {max(result)}")