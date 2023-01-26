package programmers.Lv0;

public class 배열의_평균값 {
	
	
	class Solution {
	    public double solution(int[] numbers) {
	        double a = 0;
	        for(int i=0; i<numbers.length; i++){
	            a = a + numbers[i];
	        }
	        double answer = a/numbers.length;
	        return answer;
	    }
	}

}
