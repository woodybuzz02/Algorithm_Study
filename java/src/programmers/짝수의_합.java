package programmers;

public class ¦����_�� {
	
	
	class Solution {
	    public int solution(int n) {
	        int answer = 0;
	        if(n%2==0){
	            while(n!=0){
	                answer += n;
	                n -= 2;
	                if(n==0){
	                    break;
	                }
	            }
	        }else{
	            n -= 1;
	            while(n!=0){
	                answer += n;
	                n -= 2;
	                if(n==0){
	                    break;
	                }
	            }
	        }
	        
	        return answer;
	    }
	}

}
