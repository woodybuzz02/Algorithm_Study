num = int(input())
num2 = num
for i in range(num):
    a = input()
    for j in range(len(a)-1):
        if a[j] == a[j+1]:
            pass
        elif a[j] in a[j+1:]:
            # aba인 경우 a다음 글자가 b인데 b다음 글자들 중에 또 a가 있다면
            num2 -= 1
            break
print(num2)


