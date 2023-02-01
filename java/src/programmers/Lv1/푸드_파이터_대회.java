package programmers.Lv1;

public class 푸드_파이터_대회 {
	
	class Solution {
	    public String solution(int[] food) {
	        String answer = "";
	        String a = "";
	        for(int i=1; i < food.length; i++){
	            a = Integer.toString(i);
	            answer += a.repeat(food[i]/2);           
	        }
	        StringBuffer sb = new StringBuffer(answer);
	        String reverse = sb.reverse().toString();
	 
	        return answer+"0"+reverse;
	    }
	}

}
