package programmers.Lv0;

public class �ﰢ����_�ϼ�����2 {

	class Solution {
	    public int solution(int[] sides) {
	        
	        int count = 0;
	        int a = 0;
	        int b = 0;
	        
	        if(sides[0] > sides[1]){
	            a = sides[0];
	            b = sides[1];
	        }else if(sides[0] < sides[1]){
	            a = sides[1];
	            b = sides[0];
	        }else{
	            // sides�� ��ҵ��� ���� ���� ���
	            a = sides[0];
	            b = sides[1];
	        }
	        
	        // a�� ���� �� ���̶�� ���� �� ���� �� ���� ���̴� �ٸ� �� ���� ������ �պ��� �۾ƾ� �մϴ�.
	        // �׷��ٸ� ���� �� ���� ���̰� 6�̶�� �ϰ� b=3�̶�� ���� �� a < b + c && a >= c ���� �մϴ�.
	        
	        for(int i = a-b+1; i<=a; i++){
	            count++;
	        }
	        
	        // c�� ���� �� ���̶�� ���� �� c < a + b && a < c ���� �մϴ�.
	        
	       for(int i = a+1; i<a+b; i++){
	            count++;
	        }

	        return count;
	    }
	}

}
