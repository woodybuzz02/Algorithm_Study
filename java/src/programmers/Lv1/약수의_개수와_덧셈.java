package programmers.Lv1;

public class �����_������_���� {
	
	class Solution {
	    public boolean solution(String s) {
	        if(s.length()==4 || s.length()==6){
	            for(int i=0; i<s.length(); i++){
	            int n = (int) s.charAt(i);
	                if(n >= 65){
	                    return false;
	                }
	            }
	            return true;
	        }else{
	            return false;
	        }
	    }
	}

}
