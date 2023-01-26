package programmers.Lv1;
import java.util.*;

public class 문자열_내림차순으로_배치하기 {
	
	class Solution {
	    public String solution(String s) {
	        String[] str = s.split("");
	        Arrays.sort(str, Collections.reverseOrder());
	        String answer = "";
	        for(String i : str){
	            answer += i;
	        }
	        return answer;
	    }
	}

}
