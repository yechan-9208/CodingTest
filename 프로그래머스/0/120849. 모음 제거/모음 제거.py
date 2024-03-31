def solution(my_string):
    out_words = ['a','e','i','o','u']
    answer = ''
    for c in my_string:
        if not c in out_words:
            answer+=c
    
    return answer