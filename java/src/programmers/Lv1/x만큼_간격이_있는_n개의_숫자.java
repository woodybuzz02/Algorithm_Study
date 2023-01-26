package programmers.Lv1;

public class x만큼_간격이_있는_n개의_숫자 {
	
	class Solution {
	    public long[] solution(int x, int n) {
	        
	        long[] answer = new long[n]; 
	        
	        for(int i=0; i<n; i++){
	            // x는 -10000000 이상, 10000000 이하인 정수입니다. -> Long타입
	            answer[i] = Long.valueOf(x)*(i+1);
	        }
	        
	        return answer;
	    }
	}

}
