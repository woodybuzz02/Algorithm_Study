package programmers.Lv0;
import java.util.*;

public class �ﰢ����_�ϼ�����1 {
	
	
	class Solution {
	    public int solution(int[] sides) {
	        Arrays.sort(sides);
	        if(sides[2]<sides[0]+sides[1]){
	            return 1;
	        }else{
	            return 2;
	        }
	    }
	}

}
