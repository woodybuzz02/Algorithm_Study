package programmers;

public class 숨어있는_숫자의_덧셈2 {
	
	class Solution {
	    public int solution(String my_string) {
	    	
	        char[] c = my_string.toCharArray();
	        for(int i=0; i<c.length; i++){
	            int a = c[i];
	            String b = "";
	            b += c[i];
	            if(a>=65){
	                my_string = my_string.replace(b," ");
	            }
	        }
	        my_string = my_string.replaceAll("\\s+", " ");
	        my_string = my_string.trim();
	        // 정규식 "\s"는 다음과 같은 종류의 공백(white space)을 나타냅니다.
	        // (\t, \n, \x0B, \f, \r)
	        // 그리고 "+"는 1번이상을 의미합니다.
	        // 즉, "\s+"는 1번 이상의 공백을 의미합니다.
	        int answer = 0;
	        if(my_string.equals("")){
	            return 0;
	        }else{
	            String[] b = my_string.split(" ");
	           
	            for(int i=0; i<b.length; i++){
	                answer += Integer.parseInt(b[i]); 
	            } 
	        }
	        return answer;
	    }
	}
	

}
