package programmers.Lv1;
import java.util.*;

public class ����_�����_����_���� {
	
	class Solution {
	    public int[] solution(String s) {
	        int[] answer = new int[s.length()];
	        Arrays.fill(answer,-1);
	        for(int i=1; i<s.length(); i++){
	            char a = s.charAt(i);
	            for(int j=i-1; 0<=j; j--){
	                char b = s.charAt(j);
	                if(a==b){
	                    answer[i] = i-j;
	                    break;
	                }
	            }
	        }
	        return answer;
	    }
	}

}
