# 부녀회장이 될테야
# 1 ≤ k, n ≤ 14
# a층의 b호에 살려면 자신의 아래(a-1)층의 1호부터 b호까지 사람들의 수의 합만큼 사람들을 데려와 살아야 한다
# 단, 아파트에는 0층부터 있고 각층에는 1호부터 있으며, 0층의 i호에는 i명이 산다.
# 예시) 1층의 3호를 산다면
# 자신의 아래 0층( 1호는 1명 2호는 2명 3호는 3명 ) 사람들의 수의 합만큼 사람들을 데려와야 된다
# 즉 6명이다.
# 2층의 3호를 산다면 1층의 1호는 1명 2호는 3명 3호는 6명이므로 10명을 데려와야 된다.
# 3층 1 5 15 35
# 2층 1 4 10 20
# 1층 1 3 6 10
# 0층 1 2 3 4

T = int(input())
for i in range(T):
    k = int(input())
    n = int(input())
    people = list()
    for j in range(n):
        people.append(j+1)
    for x in range(k):
        for y in range(1, n):
            people[y] += people[y-1]
    print(people[n-1])