package programmers.Lv0;

public class 중복된_문자_제거 {
	
	class Solution {
	    public String solution(String my_string) {
	        String[] ss = my_string.split("");
	        String answer = "";
	        for(int i=0; i<ss.length; i++){
	            if(answer.contains(ss[i]) != true){
	                answer += ss[i];
	            }
	        }
	        return answer;
	    }
	}

}
