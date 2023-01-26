package programmers.Lv1;

public class 자릿수_더하기 {
	
	public class Solution {
	    public int solution(int n) {
	        
	        int answer = 0;
	        
	        String strN = Integer.toString(n);
	        
	        String[] strNArr = strN.split("");
	        
	        for(String str : strNArr){
	            answer += Integer.parseInt(str);
	        }

	        return answer;
	    }
	}

}
