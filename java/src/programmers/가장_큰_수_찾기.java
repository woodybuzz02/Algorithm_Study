package programmers;
import java.util.*;
import java.util.stream.Collectors;

public class 가장_큰_수_찾기 {
	
	class Solution {
	    public int[] solution(int[] array) {
	        
	        int[] answer = new int[2]; 
	        
	        // 배열을 리스트로 바꿔둔다.
	        List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());
	        
	        // 배열에서 가장 큰 수 찾아둔다.
	        Arrays.sort(array);  
	        answer[0] = array[array.length-1];
	        
	        
	        // 큰 수의 인덱스 찾기(바꿔둔 리스트 써먹기)
	        for (int s : list){
	            if(s == answer[0]){
	                answer[1] = list.indexOf(s);
	                return answer;
	            }
	        }
	        
	        return answer;
	    }
	}
	

}

// 리스트 -> 배열로 변환
// 스트림쓰니까 훨씬 간단하고 편한 것같다.