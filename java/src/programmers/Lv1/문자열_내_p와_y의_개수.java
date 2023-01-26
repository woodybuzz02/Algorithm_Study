package programmers.Lv1;

public class 문자열_내_p와_y의_개수 {
	
	class Solution {
	    boolean solution(String s) {
	        
	        s = s.toLowerCase();
	        
	        int pCount = s.length()-s.replace("p","").length();
	        int yCount = s.length()-s.replace("y","").length();
	        
	        if(pCount == yCount){
	            return true;
	        }else{
	            return false;
	        }
	        
	    }
	}

}
