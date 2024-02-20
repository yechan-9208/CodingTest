def solution(s, n):
    result=''
#     for c in s:
#         c_ord=ord(c)
        
#         if c_ord==32:
#            result+=' '
#         else:
#             c_ord+=n
            
#             if c_ord>122 or 90<c_ord<97:
#                 c_ord-=26

#             result+=chr(c_ord)


    for c in s:
        c_ord=ord(c)
        
        if c_ord==32:
           result+=' '
        elif 97<=c_ord<=122:
            c_ord+=n
            if c_ord>122:
                c_ord-=26
            result+=chr(c_ord)
            
        else:
            c_ord+=n
            if c_ord>90:
                c_ord-=26
            result+=chr(c_ord)

            
    return result