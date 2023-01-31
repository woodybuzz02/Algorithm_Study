package programmers.Lv1;

public class 이상한_문자_만들기 {
	
	class Solution {
	    public String solution(String s) {
	        String answer = "";
	        int indexS = 0;

	        for(int i=0; i<s.length(); i++){
	            if(s.charAt(i) != ' '){
	                indexS++;
	                String a = "";
	                a += s.charAt(i);
	                if( indexS%2 != 0 ){
	                    answer += a.toUpperCase();
	                }else{
	                    answer += a.toLowerCase();
	                }
	            }else{
	                indexS = 0;
	                answer += " ";
	            }
	        }
	        
	        return answer;
	    }
	}

}
