package programmers;

public class 옹알이1 {
	
	
	class Solution {
	    public int solution(String[] babbling) {
	        int answer = 0;
	        
	        for(int i=0; i<babbling.length; i++){
	            
	            String b = babbling[i];
	            
	            // aya", "ye", "woo", "ma"는 각각 최대 한 번씩만 등장
	            
	            b = b.replace("aya", "---");
	            b = b.replace("ye", "--");
	            b = b.replace("woo", "---");
	            b = b.replace("ma", "--");
	            b = b.replace("-", "");

	            if(b.length() == 0){
	                answer += 1; 
	            };
	        }
	        return answer;
	        
	        }
	    }

}
