package programmers.Lv1;
import java.util.*;

public class 같은_숫자는_싫어 {
	
	public class Solution {
	    public int[] solution(int[] arr) {
	        
	        List<Integer> newList = new ArrayList<>();
	        newList.add(arr[0]);
	        
	        for(int i = 0; i < arr.length-1; i++){
	            if(arr[i] != arr[i+1]){
	                newList.add(arr[i+1]);
	            }
	        }
	        
	        int[] arr2 = newList.stream().mapToInt(i -> i).toArray();
	    
	        return arr2;
	    }
	}

}
