package programmers.Lv0;
import java.util.*;

public class ���_���ϱ� {
	
	class Solution {
	    public int[] solution(int n) {
	        List<Integer> list = new ArrayList<>();
	        for(int i=1; i<=n; i++){
	            if(n%i==0){
	                list.add(n/i);
	            }
	        }
	        int[] answer = list.stream().mapToInt(i->i).toArray();
	        Arrays.sort(answer);
	        return answer;
	    }
	}
	

}
