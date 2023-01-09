n = int(input())

line = 0
num = 0

while n > num:
    line += 1
    num += line

diff = num-n
if line % 2 == 0:
    start = line - diff
    end = diff + 1
    print(str(start)+"/"+str(end))
else:
    start = diff + 1
    end = line - diff
    print(str(start) + "/" + str(end))






