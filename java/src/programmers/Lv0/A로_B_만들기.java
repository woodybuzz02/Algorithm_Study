package programmers.Lv0;
import java.util.*;

public class A로_B_만들기 {

	class Solution {
	    public int solution(String before, String after) {
	        String[] b = before.split("");
	        Arrays.sort(b);
	        String[] a = after.split("");
	        Arrays.sort(a);
	        if(Arrays.equals(b, a)){
	            return 1;
	        }else{
	            return 0;
	        }
	    }
	}

}
