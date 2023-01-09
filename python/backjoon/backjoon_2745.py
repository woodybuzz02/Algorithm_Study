# ZZZZZ 36 첫째 줄에 N과 B가 주어진다. (2 ≤ B ≤ 36)
# 10진법은 0부터 9를 씀
# ord()함수 이용 -> 유니코드 문자에 대응되는 정수표현 예시 ord("A") = 65
# B가 A일 때 ord("A") - 55
# 5678 = 5*8^2 + 6*8^1 + 7*8^0 = 320 + 48 + 7 = 37510
# 파이썬 리스트의 요소 개수 구하기 → len() 사용
# ange함수 매개변수에 숫자를 두개 넣는 경우
# range(A, B) A부터 B-1 까지의 정수 범위를 반환, B-1 이라는 것에 주의


def notation(N, B):
    n = list(N)
    x = len(n) - 1
    for i in range(x, -1, -1):
        if '0' <= n[i] <= '9':
            n[i] = int(n[i])
        else:
            n[i] = ord(n[i]) - 55
    b = int(B)
    n.reverse()
    decimal = 0
    for i in range(0, x+1):
        e = b ** i
        decimal += n[i] * e
    return decimal


c, d = input().split()
print(notation(c, d))
