package programmers.Lv0;

public class ���ڿ�_����ϱ� {
	
	class Solution {
	    public int solution(String my_string) {
	        
	        String[] list = my_string.split(" ");
	        
	        int a = Integer.parseInt(list[0]);
	        
	        for(int i = 1; i<list.length; i+= 2){
	            if(list[i].equals("+")){
	                a += Integer.parseInt(list[i+1]);
	            }else{
	                a -= Integer.parseInt(list[i+1]);
	            }
	        }
	 
	        return a;
	    }
	}
	
}
