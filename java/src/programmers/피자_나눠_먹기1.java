package programmers;

public class ����_����_�Ա�1 {
	
	class Solution {
	    public int solution(int n) {
	        int answer = 0;
	        if(n%7 != 0){
	            answer += 1;
	        }
	        answer += n/7;
	        return answer;
	    }
	}

}
