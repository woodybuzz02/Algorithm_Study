def solution(prices):
    length=len(prices)
    answer = [0] * length
    for i in range(length):
        for j in range(i+1, length):
            if prices[i] <= prices[j]:
                answer[i] += 1
            else :
                answer[i] += 1
                break
    return answer

prices = [1, 2, 3, 2, 3]
print(solution(prices))
