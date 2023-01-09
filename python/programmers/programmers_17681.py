# 지도 1 또는 지도 2 중 어느 하나라도 벽인 부분은 전체 지도에서도 벽이다.
# 지도 1과 지도 2에서 모두 공백인 부분은 전체 지도에서도 공백이다. -> 벽은 1, 공백은 0, 비트연산 OR(|)을 하면 될 듯하다.
# 배열을 이진수로 변환
# bin함수로 하면 문자열값으로 나옴. 연산을 위한 전처리가 필요함. 앞에 0b지우기 그리고 한 변 크기 n을 맞춰야된다.

def solution(n, arr1, arr2):
    answer = []
    arr_01 = []
    arr_02 = []
    for i in range(n):
        arr_01.append(bin(arr1[i])[2:])
        arr_02.append(bin(arr2[i])[2:])
        arr_01[i] = ('0'*(n-len(arr_01[i])))+arr_01[i]
        arr_02[i] = ('0'*(n-len(arr_02[i])))+arr_02[i]
        y = ''
        for j in range(n):
            x = int(arr_01[i][j])|int(arr_02[i][j])
            if x == 0:
                y += ' '
            else:
                y += '#'
        answer.append(y)
    return answer

print(solution(5,[9, 20, 28, 18, 11],[30, 1, 21, 17, 28]))