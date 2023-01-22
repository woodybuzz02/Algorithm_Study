package programmers;

public class 다항식_더하기 {

	class Solution {
	    public String solution(String polynomial) {
	        
	        String[] p = polynomial.split(" ");
	        int xp = 0;
	        int num = 0;
	        
	        for(int i = 0; i<p.length; i += 2){
	            if(p[i].contains("x")){
	                if(p[i].equals("x")){
	                    xp +=1;
	                }else{
	                    int xp2 = Integer.parseInt(p[i].substring(0,p[i].length()-1));
	                    xp += xp2;
	                }
	            }else{
	                int nump = Integer.parseInt(p[i]);
	                num += nump;               
	            }
	        }
	        
	        String sx = "";
	        if(xp==0){
	            sx = "";
	        }else if(xp==1){
	            sx = "x";
	        }else{
	            sx = Integer.toString(xp)+"x";
	        }
	        
	        String snum = "";
	        if(num!=0){
	            snum = Integer.toString(num);
	        }
	         
	        String answer = "";
	        if(xp==0){
	            answer = snum;
	        }else if(num==0){
	            answer = sx;
	        }else{
	            answer = sx+" + "+snum;    
	        }
	        return answer;
	    }
	}
	

}
