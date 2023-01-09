# 벌집
# 일단 규칙을 찾아보자!
# 첫번째 층 1 -> 1
# 두번째 층 2 ~ 7 -> 6
# 세번째 층 8 ~ 19 -> 12
# 네번째 층 20 ~ 37 -> 18
# 6의 배수로 늘어난다는 것을 알 수 있다.

# 1. 숫자 n을 입력 받는다.
# 2. room_c = 1, room_range = 1
# 3. n = 1 인지 확인!
# 3-1. 맞다면 1 출력
# 3-2. room_range가 n 이상이 될 떄까지 반복 -> room_range + 6*room_c room_c+=1

n = int(input())
room_c = 1
room_range = 1
if n == 1:
    print(room_c)
else:
    while room_range < n:
        room_range += (6 * room_c)
        room_c += 1
    print(room_c)