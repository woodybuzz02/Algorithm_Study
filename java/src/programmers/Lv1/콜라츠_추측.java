package programmers.Lv1;

public class ÄÝ¶óÃ÷_ÃßÃø {
	
	class Solution {
	    public int solution(int num) {
	        
	        int count = 0;
	        
	        Long x = Long.valueOf(num);
	        
	        if(x == 1){
	            return 0;
	        }
	        
	        while(x != 1){
	            
	            if(x%2 == 0){
	                x = x/2;
	                count++;
	            }else{
	                x = (x*3) + 1;
	                count++;
	            }
	            
	            if(count==500){
	                return -1;
	            }
	        }
	        
	        return count;
	    }
	}

}
