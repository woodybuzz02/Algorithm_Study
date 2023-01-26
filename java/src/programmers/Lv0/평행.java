package programmers.Lv0;

public class ���� {
	
	class Solution {
		
	    public int solution(int[][] dots) {
	        // ������ �� ���� ���Ⱑ ����.
	        // ���� = y�� ���� �������� x�� ���� ���������� ���� ��
	        // �� ������ ��ġ�� ���(��ġ�ϴ� ���)���� 1�� return
	             
	        // ��� 1
	        int y1 = dots[0][1] - dots[1][1];
	        int x1 = dots[0][0] - dots[1][0];
	        double inclination1 = (y1/x1) + (y1%x1);
	        
	        int y2 = dots[2][1] - dots[3][1];
	        int x2 = dots[2][0] - dots[3][0];
	        double inclination2 = (y2/x2) + (y2%x2);
	        
	        if(inclination1 == inclination2){
	            return 1;
	        }
	        
	        
	        // ��� 2
	        y1 = dots[0][1] - dots[2][1];
	        x1 = dots[0][0] - dots[2][0];
	        inclination1 = (y1/x1) + (y1%x1);
	        
	        y2 = dots[1][1] - dots[3][1];
	        x2 = dots[1][0] - dots[3][0];
	        inclination2 = (y2/x2) + (y2%x2);
	        
	        if(inclination1 == inclination2){
	            return 1;
	        }
	        
	        // ��� 3
	        y1 = dots[0][1] - dots[3][1];
	        x1 = dots[0][0] - dots[3][0];
	        inclination1 = (y1/x1) + (y1%x1);
	        
	        y2 = dots[1][1] - dots[2][1];
	        x2 = dots[1][0] - dots[2][0];
	        inclination2 = (y2/x2) + (y2%x2);
	        
	        if(inclination1 == inclination2){
	            return 1;
	        }else{
	            return 0;
	        }
	    }
	}

}
