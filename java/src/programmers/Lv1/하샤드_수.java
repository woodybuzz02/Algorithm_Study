package programmers.Lv1;

public class ÇÏ»þµå_¼ö {
	
	class Solution {
	    public boolean solution(int x) {
	        
	        String strX = Integer.toString(x);
	        String[] arrX = strX.split("");
	        int a = 0;
	        
	        for(int i=0; i<arrX.length; i++){
	            a += Integer.parseInt(arrX[i]);
	        }
	        
	        if(x%a == 0){
	            return true;
	        }else{
	            return false; 
	        }

	    }
	}

}
