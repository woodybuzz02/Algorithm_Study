package programmers;

public class 대문자와_소문자 {
	
	class Solution {
	    public String solution(String my_string) {
	        String answer = "";
	        for(int i=0; i<my_string.length(); i++){
	            int a = (int) my_string.charAt(i);
	            if(a >= 65 && a <= 90){
	                char b = (char) (a+32);
	                answer += b;
	            }else{
	                char b = (char) (a-32);
	                answer += b;
	            }
	        }
	        
	        return answer;
	    }
	}
	

}
