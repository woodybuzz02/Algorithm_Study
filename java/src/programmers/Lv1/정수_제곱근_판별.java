package programmers.Lv1;

public class ����_������_�Ǻ� {
	
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
