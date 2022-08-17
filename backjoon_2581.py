m = int(input())
n = int(input())
result = set()
for i in range(m, n+1):
    cnt = 0
    if i == 1:
        continue
    for j in range(2, i + 1):
        if i % j == 0:
            cnt += 1
    if cnt == 1:
        result.add(i)

if len(result) > 0:
    print(sum(result))
    print(min(result))
else:
    print(-1)


