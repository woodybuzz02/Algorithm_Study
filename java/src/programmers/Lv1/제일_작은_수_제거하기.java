package programmers.Lv1;
import java.util.*;
import java.util.stream.Collectors;

public class 제일_작은_수_제거하기 {
	
	class Solution {
	    public int[] solution(int[] arr) {
	        
	        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
	        List<Integer> answer = new ArrayList<>();
	        
	        Arrays.sort(arr);
	        
	        for(int l : list){
	            if(l != arr[0]){
	                answer.add(l);
	            }
	        }
	        
	        if(answer.size()==0){
	            answer.add(-1);
	        }

	        int[] arr2 = answer.stream()
	            .mapToInt(i -> i)
	            .toArray();
	        
	        return arr2;
	    }
	}

}
