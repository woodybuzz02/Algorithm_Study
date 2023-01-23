package programmers;
import java.util.*;

public class 공_던지기 {

	class Solution {
	    public int solution(int[] numbers, int k) {
	        
	        List<Integer> intList = new ArrayList<>();
	        
	        for(int i = 1; i<=k; i++){
	            for(int in : numbers){
	                intList.add(in);
	            }
	        }
	        
	        // k번째로 공을 던지는 사람의 번호
	        int n = 2*(k-1);
	        
	        int answer = intList.get(n);
	        
	        return answer;
	    }
	}

}
