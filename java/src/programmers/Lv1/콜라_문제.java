package programmers.Lv1;

public class �ݶ�_���� {
	
	class Solution {
	    public int solution(int a, int b, int n) {
	        int answer = 0;
	        int bottle = n;
	        int plus = 0;
	        
	        while(bottle >= a){
	            
	            plus = (bottle/a)*b;
	            
	            answer += plus; 
	            
	            bottle = plus + (bottle%a);
	            
	        }
	        
	        
	        return answer;
	    }
	}	
	
}
