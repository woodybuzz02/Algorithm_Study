package programmers.Lv1;

public class 수박수박수박수박수박수 {
	
	class Solution {
	    public String solution(int n) {
	        
	        String ans = "수박";
	        
	        if(n%2 == 0){
	            return ans.repeat(n/2);
	        }else{
	            return ans.repeat(n/2) + "수";
	        }

	    }
	}

}
