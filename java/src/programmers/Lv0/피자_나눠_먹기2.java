package programmers.Lv0;

public class ����_����_�Ա�2 {
	
	class Solution {
	    public int solution(int n) {
	        int i = 1;
	        int p = 0;
	        while(true){
	            p = 6*i;
	            if(p%n==0){
	                break;
	            }
	            i++;
	        }
	        int answer = i;
	        return answer;
	    }
	}

}
