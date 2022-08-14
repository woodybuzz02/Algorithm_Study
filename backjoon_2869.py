# a, b, c = map(int, input().split())
# f = 0
# day = 0
# while True:
#     f += a
#     day += 1
#     if f >= c:
#         break
#     else:
#         f -= b
# # print(day)

from sys import stdin
import math

a, b, c = map(int, stdin.readline().split())
g = (c - b)/(a - b)
print(math.ceil(g))


