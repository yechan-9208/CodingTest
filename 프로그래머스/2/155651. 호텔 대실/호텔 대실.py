def solution(book_time):
    answer = 0
    
    total_time=[]
    max=1
    count=0

    sort_time=sorted(book_time)

    for i in sort_time:
        in_h,in_m = i[0].split(":")
        out_h,out_m = i[1].split(":")
        
        
        in_time = int(in_h)*60+int(in_m)
        out_time = int(out_h)*60+int(out_m)+10

        total_time.append([in_time,out_time])
        
    max=1
    count=0
    save_time=[]
    for i in total_time:
        for e,save_t in enumerate(save_time):
            if save_t <= i[0]:
                save_time.pop(e)
        save_time.append(i[1])
        
        if len(save_time)>max:
            max=len(save_time)
        
                
    
    
    
    
    
    
#     for h in range(1,25):
#         for m in range(0,60):

#             for i in range(len(intime)):
                
#                 if h==outtime[i][0] and m == outtime[i][1]:
#                     count-=1

#                 if str(h)==intime[i][0] and m==int(intime[i][1]):
#                     count+=1

#             if max<count:
                # max=count


    return max