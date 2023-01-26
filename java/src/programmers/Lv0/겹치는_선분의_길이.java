package programmers.Lv0;
import java.util.*;

public class 겹치는_선분의_길이 {
	
	
	class Solution {
	    public int solution(int[][] lines) {
	        
	        int[] line = new int[200];
	        
	        Arrays.fill(line, 0);
	        
	       // [2,5]라면 2 ~ 3은 102자리에 1, 3 ~ 4은 103자리에 1, 4 ~ 5은 104자리에 1 
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
