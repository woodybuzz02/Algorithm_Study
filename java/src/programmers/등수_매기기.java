package programmers;
import java.util.*;

public class ���_�ű�� {
	
	
	class Solution {
	    public int[] solution(int[][] score) {
	    	
	        List<Integer> scoreList = new ArrayList<>();
	        // �� ���� ���� ���� ū ���� ��յ� Ŭ ���̴�.
	        // �׷��� �� ���� �ո����ε� ���!
	        for(int[] s : score){
	            scoreList.add(s[0]+s[1]);
	        }
	        
	        // ������������ �����Ͽ� ������ �ű��.
	        scoreList.sort(Comparator.reverseOrder());
	        
	        // ������ �������!
	        int[] rank = new int[score.length];
	        // score�� ���� ���ھ��Ʈ���� ��� ��ġ�ߴ��� ã�� �� +1�� �ϸ� ������ ���´�.
	        for (int i = 0; i < score.length; i++) {
	            rank[i] = scoreList.indexOf(score[i][0] + score[i][1]) + 1;
	        }
	        return rank;

	    }
	}

}
