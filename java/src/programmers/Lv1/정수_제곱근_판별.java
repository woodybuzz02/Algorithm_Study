package programmers.Lv1;

public class 정수_제곱근_판별 {
	
	class Solution {
	    public long solution(long n) {
	        
	        for(long i = 1; i <= n; i++){
	            if(i*i == n){
	                return (i+1)*(i+1);
	            }
	        }
	        return -1;
	        
	    }
	}

}
