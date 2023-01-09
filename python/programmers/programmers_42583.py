def solution(bridge_length, weight, truck_weights):
    bridge = [0] * bridge_length
    answer = 0
    while bridge:
        bridge.pop(0)
        answer += 1
        if truck_weights:
            if sum(bridge) + truck_weights[0] <= weight:
                bridge.append(truck_weights[0])
                truck_weights.pop(0)
            else:
                bridge.append(0)
    return answer

print(solution(2,10,[7,4,5,6]))



# bridge_length 다리에 올라갈 수 있는 트럭 수, 다리 길이
# weight 다리가 견딜 수 있는 무게
# truck_weights 트럭 별 무게
#
# 문제가 이상하다..
# 트럭이 1초에 1 length만큼 전진한다.
# 차 순서는 바뀌지않는다.
# 입출력 예 bridge_length 2 	weight 10 	truck_weights	[7,4,5,6]
# bridge는 다리를 건너는 중인 것을 표현했고 while문을 통해 다리를 다 건넜으면 멈추도록 while bridge:라고 했다.
# 일단 다리를 건너는 중일때 1초마다 한칸씩 지나갈 수 있도록 answer += 1, bridge.pop(0)를 썼다.
# 그 후 sum(bridge) + truck_weights[0] <= weight일 때와 아닌 경우로 나누어서 상황에 맞게 리스트 내용을 추가, 삭제를 했다.


