package programmers.Lv1;
import java.util.*;

public class 문자열_내_마음대로_정렬하기 {
	
	class Solution {
	    public String[] solution(String[] strings, int n) {
	        String[] answer = new String[strings.length];
	        String[] stringN = new String[strings.length];
	        for(int i=0; i<strings.length; i++){
	            String a = "";
	            a += strings[i].charAt(n);
	            a += " "+strings[i];
	            stringN[i] = a;
	        }
	        Arrays.sort(stringN);
	        
	        for(int i=0; i<stringN.length; i++){
	            String[] a = stringN[i].split(" ");
	            answer[i] = a[1];
	        }
	          
	        return answer;
	    }
	}
	
}
