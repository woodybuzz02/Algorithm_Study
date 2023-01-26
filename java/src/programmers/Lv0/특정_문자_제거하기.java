package programmers.Lv0;

public class 특정_문자_제거하기 {
	
	class Solution {
	    public String solution(String my_string, String letter) {
	        String answer = my_string.replace(letter,"");
	        return answer;
	    }
	}

}
