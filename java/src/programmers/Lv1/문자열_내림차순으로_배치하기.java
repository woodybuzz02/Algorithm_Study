package programmers.Lv1;
import java.util.*;

public class ���ڿ�_������������_��ġ�ϱ� {
	
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
