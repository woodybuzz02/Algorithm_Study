package programmers;

public class 인덱스_바꾸기 {

	class Solution {
	    public String solution(String my_string, int num1, int num2) {
	        String[] answer = my_string.split("");
	        answer[num2] = Character.toString(my_string.charAt(num1));
	        answer[num1] = Character.toString(my_string.charAt(num2));
	        String a = "";
	        for(int i=0; i<answer.length; i++){
	            a += answer[i];
	        }
	        return a;
	    }
	}

}
