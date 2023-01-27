package programmers.Lv1;

public class _3진법_뒤집기 {
	
	class Solution {
	    public int solution(int n) {
	        
	        String nStr = "";
	        
	        while(n!=0){

	            nStr += Integer.toString(n%3);
	            
	            n = n/3; 
	        }
	        
	        return Integer.parseInt(nStr, 3);
	        
	    }
	}


}
