package programmers;
import java.util.*;

public class ��ȣ�ص� {
	
	
	class Solution {
	    public String solution(String cipher, int code) {
	        String answer ="";
	    	for (int i = code-1; i < cipher.length(); i+=code) {
				answer += cipher.charAt(i);
			}
	    	return answer;
	    }
	}

}
