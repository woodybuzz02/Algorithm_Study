package programmers.Lv1;
import java.util.*;

public class 정수_내림차순으로_배치하기 {
	
	class Solution {
	    public long solution(long n) {
	        String strN = Long.toString(n);
	        String[] arrN = strN.split("");
	        Arrays.sort(arrN,Collections.reverseOrder());
	        String N = "";
	        for(int i=0; i<=arrN.length-1; i++){
	            N += arrN[i];
	        }
	        long answer = Long.parseLong(N);
	        return answer;
	    }
	}
	
}
