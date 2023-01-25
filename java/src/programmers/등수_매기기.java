package programmers;
import java.util.*;

public class 등수_매기기 {
	
	
	class Solution {
	    public int[] solution(int[][] score) {
	    	
	        List<Integer> scoreList = new ArrayList<>();
	        // 두 수의 합이 가장 큰 것이 평균도 클 것이다.
	        // 그래서 두 수의 합만으로도 충분!
	        for(int[] s : score){
	            scoreList.add(s[0]+s[1]);
	        }
	        
	        // 내림차순으로 정렬하여 순위를 매긴다.
	        scoreList.sort(Comparator.reverseOrder());
	        
	        // 순위를 출력하자!
	        int[] rank = new int[score.length];
	        // score의 수가 스코어리스트에서 어디에 위치했는지 찾은 후 +1을 하면 순위가 나온다.
	        for (int i = 0; i < score.length; i++) {
	            rank[i] = scoreList.indexOf(score[i][0] + score[i][1]) + 1;
	        }
	        return rank;

	    }
	}

}
