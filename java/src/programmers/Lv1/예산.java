package programmers.Lv1;
import java.util.*;

public class 예산 {
	
	class Solution {
	    public int solution(int[] d, int budget) {
	        int answer = 0;
	        Arrays.sort(d);
	        for(int a : d){
	            if(budget-a < 0){
	                break;
	            }
	            budget -= a;
	            answer++;
	        }
	        return answer;
	    }
	}
	
}

// 최대한 많은 부서에 예산을 주기위해서는 예산요청금액이 제일 적은 곳부터 지원을 할 것이다.