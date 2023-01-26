package programmers.Lv0;
import java.util.*;

public class ÃÖ´ñ°ª_¸¸µé±â2 {

	class Solution {
	    public int solution(int[] numbers) {
	        int len = numbers.length;
	        Arrays.sort(numbers);
	        int a = numbers[0]*numbers[1];
	        int b = numbers[len-1]*numbers[len-2];
	        if(a>b){
	            return a;
	        }else{
	            return b;
	        }
	    }
	}

}
