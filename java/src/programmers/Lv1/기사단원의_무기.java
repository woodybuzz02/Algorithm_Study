package programmers.Lv1;

public class 기사단원의_무기 {
	
//	class Solution {
	    public int solution(int number, int limit, int power) {
	        int answer = 0;
	        for(int i = 1; i <= number; i++){
	            answer += divisor_cnt(i, limit, power);
	        }
	        return answer;
	    }
	    
	    
	    private int divisor_cnt(int number, int limit, int power){
	        int count = 0;
	        
	        for(int i = 1; i <= Math.sqrt(number); i++){
	            if(number % i == 0){
	                if(number/i == i){
	                    count += 1;
	                }else{
	                    count += 2;
	                }
	            }
	        }
	        
	        if(count>limit){
	            return power;
	        }
	        
	        return count;
	    }
	    
//	}

	
}
