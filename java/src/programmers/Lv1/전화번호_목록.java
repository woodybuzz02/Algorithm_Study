package programmers.Lv1;
import java.util.*;

public class ��ȭ��ȣ_��� {
	
	class Solution {
	    public boolean solution(String[] phone_book) {
	        Arrays.sort(phone_book);
	        boolean answer = true;       
	  
	        for(int i=0; i<phone_book.length; i++){
	            if(i == phone_book.length -1) break;
	            if(phone_book[i+1].startsWith(phone_book[i])){
	                answer = false;
	                break;
	            }
	        }        

	        return answer;
	    }
	}	

}
