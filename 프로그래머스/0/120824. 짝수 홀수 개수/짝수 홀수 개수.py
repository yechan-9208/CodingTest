def solution(num_list):
    answer = [n for n in num_list if n%2==0]
    return [len(answer),len(num_list)-len(answer)]