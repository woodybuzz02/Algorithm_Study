package programmers.Lv1;
import java.util.*;

public class ���� {
	
	class Solution {
	    public int solution(int[] d, int budget) {
	        int answer = 0;
	        Arrays.sort(d);
	        for(int a : d){
	            if(budget-a < 0){
	                break;
	            }
	            budget -= a;
	            answer++;
	        }
	        return answer;
	    }
	}
	
}

// �ִ��� ���� �μ��� ������ �ֱ����ؼ��� �����û�ݾ��� ���� ���� ������ ������ �� ���̴�.