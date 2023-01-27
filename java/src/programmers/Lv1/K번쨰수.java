package programmers.Lv1;
import java.util.*;

public class K������ {
	
	class Solution {
	    public int[] solution(int[] array, int[][] commands) {
	        // commands�� ���̴� 1 �̻� 50 �����̴�.
	        int[] answer = new int[commands.length];
	        for(int i=0; i<commands.length;i++){
	            List<Integer> select = new ArrayList<>();
	            for(int j=commands[i][0]-1; j<commands[i][1]; j++){
	                select.add(array[j]);
	            }
	            Collections.sort(select);
	            answer[i] = select.get(commands[i][2]-1);
	        }
	        return answer;
	    }
	}


}
