package programmers;
import java.util.*;

public class 최댓값_만들기1 {
	
	
	class Solution {
	    public int solution(int[] numbers) {
	        Arrays.sort(numbers);
	        int max1 = numbers[numbers.length-1];
	        int max2 = numbers[numbers.length-2];
	        int answer = max1*max2;
	        return answer;
	    }
	}

}
