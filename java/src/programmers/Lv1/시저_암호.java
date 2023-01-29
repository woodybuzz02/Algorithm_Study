package programmers.Lv1;

public class 시저_암호 {
	
	class Solution {
	    public String solution(String s, int n) {
	        String answer = "";
	        for(int i=0; i<s.length(); i++){
	            if(s.charAt(i) == ' '){
	                answer += s.charAt(i);
	            }else{
	                int sCharInt = (int) s.charAt(i);
	                int num = sCharInt + n;
	                if(Character.isUpperCase(s.charAt(i))){
	                    if(num>90){
	                        num = (num-90)+64;
	                    }    
	                }else{
	                    if(num>122){
	                        num = (num-122)+96;
	                    }   
	                }
	                char ch = (char) num;
	                answer += ch;
	            } 
	        }
	        return answer;
	    }
	}
	
}
