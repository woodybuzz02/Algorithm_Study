package programmers.Lv0;

public class �ڸ���_���ϱ� {
	
	
	class Solution {
	    public int solution(int n) {
	        String ans = Integer.toString(n);
	        int answer = 0;
	        for(int i=0; i<ans.length(); i++){
	            answer += Character.getNumericValue(ans.charAt(i));
	        }   
	        return answer;
	    }
	}

}
