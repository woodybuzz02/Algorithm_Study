package programmers;
import java.util.*;

public class �������_���ϱ� {
	
	class Solution {
	    public Integer[] solution(int[] emergency) {
	        
	        Integer[] answer = new Integer[emergency.length];
	        
	        List<Integer> list = new ArrayList<Integer>();
	        for(int i=0; i<answer.length; i++){
	            list.add(emergency[i]);
	        } 
	        Collections.sort(list, Collections.reverseOrder());
	        
	        Integer[] integerArr = list.toArray(new Integer[list.size()]);
	        
	        for(int i=0; i<answer.length; i++){
	            for(int j=0; j<answer.length; j++){
	                if(emergency[i] == integerArr[j]){
	                    answer[i] = j+1;
	                }
	            }
	        }
	        return answer;
	    }
	}

}
