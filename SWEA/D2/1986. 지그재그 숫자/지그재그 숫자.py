
T = int(input())

for test_case in range(1, T + 1):
	n= int(input())
	result=(n+1)//2
	if not n%2:
		result*=-1
	print(f"#{test_case} {result}")
   
