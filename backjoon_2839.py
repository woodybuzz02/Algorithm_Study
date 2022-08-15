n = int(input())
box = 0;
while n>=0:
    if n%5 == 0:
        box+=n//5
        print(box)
        break
    elif n<3:
        print(-1)
        break
    else:
        n-=3
        box+=1