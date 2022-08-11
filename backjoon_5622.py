Number = ['ABC', 'DEF', 'GHI', 'JKL', 'MNO', 'PQRS', 'TUV', 'WXYZ']
a = input()
time = 0
for i in a:
    for j in Number:
        if i in j:
            time += Number.index(j) + 3

print(time)

# 문제를 잘 보자..ㅎ