package programmers.Lv1;

public class ���ڿ�_��_p��_y��_���� {
	
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
