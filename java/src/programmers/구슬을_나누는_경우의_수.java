package programmers;
import java.math.BigInteger;

public class 구슬을_나누는_경우의_수 {
	
	class Solution {
	    
	    public BigInteger solution(int balls, int share) {
	        
	    	// 팩토리얼을 담을 배열 준비
	        BigInteger[] DP = new BigInteger[31];
	        // 미리 인덱스가 0과 1인 곳에 값 넣기
	        DP[0] = new BigInteger("1");
	        DP[1] = new BigInteger("1");
	        // 히나씩 담기, 인덱스가 2인 것부터 시작
	        for (int i = 2; i <= 30; i++) {
	            DP[i] = DP[i - 1].multiply(new BigInteger(Integer.toString(i)));
	        }
	        // 범위에 있는 것을 다 구했다면 서로 다른 n개 중 m개를 뽑는 경우의 수 공식 적용
	        return (DP[balls].divide(DP[balls - share].multiply(DP[share])));

	    }
	}
	
}

// 동적 계획법(Dynamic Programing, DP)은 모든 방법을 일일이 검토하여 최적의 해를 찾아내는 방식의 알고리즘
// 처음 진행되는 연산은 기록해 두고, 이미 진행했던 연산이라면 다시 연산하는 것이 아니라 기록되어 있는 값을 가져오는 것
// 일한 문제를 반복해야 할 경우, 한 번 계산된 결과를 저장해 두었다가 활용하는 방식으로 중복 계산을 줄이는 것을 메모이제이션(Memoization)

