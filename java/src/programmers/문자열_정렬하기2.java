package programmers;
import java.util.*;

public class 문자열_정렬하기2 {
	
	class Solution {
	    public String solution(String my_string) {
	        my_string = my_string.toLowerCase();
	        String[] arr = my_string.split("");
	        Arrays.sort(arr);
	        String answer = "";
	        for(int i=0; i<arr.length; i++){
	            answer += arr[i];
	        }
	        return answer;
	    }
	}
	

}
