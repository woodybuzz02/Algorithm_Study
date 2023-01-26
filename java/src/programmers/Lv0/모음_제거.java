package programmers.Lv0;

public class 모음_제거 {
	
	class Solution {
	    public String solution(String my_string) {
	        my_string = my_string.replace("a","");
	        my_string = my_string.replace("e","");
	        my_string = my_string.replace("i","");
	        my_string = my_string.replace("o","");
	        my_string = my_string.replace("u","");
	        return my_string;
	    }
	}

}
