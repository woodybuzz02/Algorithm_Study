def solution(progresses, speeds):
    answer = [1]
    completion_date = []

    for i in range(len(progresses)):
        if ((100-progresses[i]) % speeds[i]) == 0:
            completion_date.append((100 - progresses[i]) // speeds[i])
        else:
            completion_date.append(((100-progresses[i])//speeds[i])+1)

    for i in range(1, len(progresses)):
        if completion_date[i] <= completion_date[i-1]:
            completion_date[i] = completion_date[i-1]
            answer[-1] += 1
        else:
            answer.append(1)

    return answer

print(solution([93, 30, 55], [1, 30, 5]))

# 각 기능이 진도 100%일 때 서비스에 반영할 수 있다.
# 각 기능의 개발 속도는 모두 다르기때문에 뒤에 있는 기능이 앞에 있는 기능보다 먼저 개발될 수 있고,
# 이때 뒤에 있는 기능은 앞에 있는 기능이 배포될 때 함께 배포된다.
#
# 예시)
# 작업의 진도가 적힌 정수 배열 progresses와 각 작업의 개발 속도가 적힌 정수 배열 speeds
# progresses [93, 30, 55]
# speeds [1, 30, 5]
#
# 그러면 기능 1을 작업진도 93%, 개발속도 1이라고 한다면 작업은 7일간 작업 후 배포된다.
# 기능 2를 작업진도 30%, 개발속도 30이라고 한다면 작업은 3일간 작업 후 배포된다.
# 기능 3을 작업진도 55%, 개발속도 5이라고 한다면 작업은 9일간 작업 후 배포된다.
# 기능 2는 3일째에 작업이 완료되지만 기능1이 다 작업이 되지않았기에 배포될 수가 없다.
# 그래서 기능 2는 기능 1이 완성되는 7일째에 같이 배포된다.
# 그 후 이틀 후 기능 3이 배포된다.

# 우리가 구해야 하는 것은 각 배포마다 몇 개의 기능이 배포되는지를 return 하도록 solution 함수 이다.
# 위의 경우 return값이 [2,1]이다.

# 제일 먼저 구해야될 것을 생각을 해본다면 각 기능들의 작업들이 언제 완료되는지를 구해야 될 것같다.
# 완료되는 날을 구했다면 언제 배포되는 지를 구하면 될 듯하다.
# 어쨌든 두 완료날짜를 비교했을 때 무조건 1이상이기에 answer = [1]로 한 후 진행했다.
