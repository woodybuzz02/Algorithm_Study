package programmers;
import java.util.*;

public class 문자열_정렬하기1 {
	
	class Solution {
	    public int[] solution(String my_string) {
	        
	        List<Integer> answer = new ArrayList<Integer>();
	        
	        for(int i=0; i<my_string.length(); i++){
	            char a = my_string.charAt(i);
	            int n = a;
	            if(n < 97){
	               answer.add(my_string.charAt(i) - '0');
	            }
	        }
	        
	        int[] arr = answer.stream().sorted().mapToInt(Integer::intValue).toArray();
	        
	        return arr;
	    }
	}

}

// 리스트 -> 배열로 변환
// 스트림쓰니까 훨씬 간단하고 편한 것같다.