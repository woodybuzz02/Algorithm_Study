package programmers.Lv1;

public class ��_����_������_�� {
	
	class Solution {
	    public long solution(int a, int b) {
	        int max = 0;
	        int min = 0;
	        
	        if(a >= b){
	            max = a;
	            min = b;
	        }else{
	            max = b;
	            min = a;
	        }
	        
	        long answer = 0;
	        
	        for(int i = min; i <= max; i++){
	            answer += i;
	        }
	        
	        return answer;
	    }
	}

}
