croatia_alphabet = ["c=", "c-", "dz=", "d-", "lj", "nj", "s=","z="]
a = input()
cnt = 0
for i in croatia_alphabet:
    cnt += a.count(i)
    a = a.replace(i, " ")
a = a.replace(" ", "")
print(cnt+len(a))