package programmers.Lv1;

public class 없는_숫자_더하기 {
	
	class Solution {
	    public int solution(int[] numbers) {
	        
	        String num = "0123456789";
	        int answer = 0;
	         
	        
	        for(int i = 0; i<numbers.length; i++){
	           num = num.replace(Integer.toString(numbers[i]),"");
	        }
	        
	        String[] num2 = num.split("");
	        
	        for(String n : num2){
	            answer += Integer.parseInt(n);
	        }
	            
	        return answer;
	    }
	}

}
