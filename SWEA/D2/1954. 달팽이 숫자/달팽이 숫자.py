T = int(input())

c_v=[0,1,0,-1]
r_v=[1,0,-1,0]


for test_case in range(1, T + 1):
	n= int(input())
	arr=[[ 0 for _ in range(n)] for _ in range(n)]
	c,r=0,0
	count=1
	i=0
    # 1. 이차원 배열에 값이 없을때
    # 2. 이차원 배열의 값에 할당이 되어 있을때
	while True:
		if c+c_v[i]<n and r+r_v[i]<n and arr[c+c_v[i]][r+r_v[i]]==0:
			arr[c][r]=count
			count+=1
			c+=c_v[i]
			r+=r_v[i]
		else:
			i=(i+1)%4
		if count>=pow(n,2):
			arr[c][r]=count
			break
	print(f"#{test_case}")
	for out_arr in arr:
		for in_arr in out_arr:
			print(in_arr,end=" ")
		print()

