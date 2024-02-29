def solution(array, height):
    more_heigher= [a for a in array if a>height]

    return len(more_heigher)