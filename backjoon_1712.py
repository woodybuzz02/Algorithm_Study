from sys import stdin
a, b, c = map(int, stdin.readline().split())
if b >= c:
    print(-1)
else:
    print(a//(c-b)+1)