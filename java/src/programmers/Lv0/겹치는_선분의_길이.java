package programmers.Lv0;
import java.util.*;

public class ��ġ��_������_���� {
	
	
	class Solution {
	    public int solution(int[][] lines) {
	        
	        int[] line = new int[200];
	        
	        Arrays.fill(line, 0);
	        
	       // [2,5]��� 2 ~ 3�� 102�ڸ��� 1, 3 ~ 4�� 103�ڸ��� 1, 4 ~ 5�� 104�ڸ��� 1 
	        for(int i = 0; i<lines.length; i++){
	            for(int j = lines[i][0] + 100; j < lines[i][1] + 100; j++){
	                line[j]++;
	            }
	        }
	        
	        int answer = 0;

	        for(int i = 0; i < 200; i++){
	            if(line[i] > 1){
	                answer++;
	            }
	        }
	        
	        return answer;
	    }
	}

}
