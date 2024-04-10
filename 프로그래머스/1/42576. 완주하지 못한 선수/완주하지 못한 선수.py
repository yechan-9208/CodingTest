def solution(participant, completion):
    participant.sort()
    completion.sort()
    
    for index,c in enumerate(completion):
        if not c==participant[index]:
            return participant[index]
    else:
        return participant[-1]
    