package programmers.Lv1;

public class �Ҽ�_ã�� {
	
	class Solution {
	    public int solution(int n) {
	        int answer = 0;
	        for(int i=2; i<=n; i++){
	            if(isPrimeNumber(i)){
	                answer++;
	            }    
	        }
	        return answer;
	    }
	    
	    boolean isPrimeNumber(int x){
	    int end = (int) Math.sqrt(x);
	    for(int i=2; i<=end; i++){
	        if(x%i == 0) return false;
	    }
	    return true;
	    }
	    
	}

}
