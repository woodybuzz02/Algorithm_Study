package programmers.Lv0;

public class ����_����_�Ա�3 {
	
	class Solution {
	    public int solution(int slice, int n) {
	        int answer = 0;
	        if(n%slice!=0){
	            answer+=1;
	        }
	        answer += n/slice;
	        return answer;
	    }
	}

}
