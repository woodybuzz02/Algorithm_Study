package programmers.Lv1;

public class x��ŭ_������_�ִ�_n����_���� {
	
	class Solution {
	    public long[] solution(int x, int n) {
	        
	        long[] answer = new long[n]; 
	        
	        for(int i=0; i<n; i++){
	            // x�� -10000000 �̻�, 10000000 ������ �����Դϴ�. -> LongŸ��
	            answer[i] = Long.valueOf(x)*(i+1);
	        }
	        
	        return answer;
	    }
	}

}
