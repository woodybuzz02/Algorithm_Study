package programmers.Lv0;
import java.util.*;

public class A��_B_����� {

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
