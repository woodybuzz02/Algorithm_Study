package programmers.Lv0;

public class �ܰ��༺��_���� {
	
	class Solution {
	    public String solution(int age) {
	        String answer = "";
	        String strAge = Integer.toString(age);
	        for(int i=0; i<strAge.length(); i++){
	            char a = strAge.charAt(i);
	            int b = a + 49;          
	            answer += (char) b;
	        }
	        return answer;
	    }
	}
	
}
