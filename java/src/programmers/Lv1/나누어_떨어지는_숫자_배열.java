package programmers.Lv1;
import java.util.*;

public class 나누어_떨어지는_숫자_배열 {
	
	class Solution {
	    public int[] solution(int[] arr, int divisor) {
	        List<Integer> divi = new ArrayList<>();
	        for(int a : arr){
	            if(a%divisor==0){
	                divi.add(a);
	            }
	        }
	        if(divi.size() == 0){
	            divi.add(-1);
	        }
	        int[] answer = divi.stream().mapToInt(i -> i).toArray();
	        Arrays.sort(answer);
	        return answer;
	    }
	}

}
