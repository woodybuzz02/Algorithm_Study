import math
import sys

def facto(num):
    num_list = list(map(int, str(num)))
    z = len(str(num))
    decimal = 0
    for i in range(len(num_list)):
        x = num_list[i]
        y = x * (math.factorial(z))
        decimal += y
        z -= 1
    return decimal

a = []
while True:
    b = sys.stdin.readline().strip()
    if not b:
        break
    a.append(int(b))

for i in range(len(a)):
    if a[i] != 0:
        print(facto(a[i]))
