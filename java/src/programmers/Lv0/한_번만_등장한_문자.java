package programmers.Lv0;
import java.util.*;

public class 한_번만_등장한_문자 {
	
	class Solution {
	    public String solution(String s) {
	        String[] a = s.split("");
	        String answer = "";
	        for(int i=0; i<s.length(); i++){
	            String s1 = s;
	            if(s.length()-s1.replace(a[i],"").length() == 1){
	                answer += a[i];
	            }
	        }
	        String[] a2 = answer.split("");
	        Arrays.sort(a2);
	        answer = String.join("",a2);
	        return answer;
	    }
	}

}
