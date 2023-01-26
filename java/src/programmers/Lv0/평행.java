package programmers.Lv0;

public class 평행 {
	
	class Solution {
		
	    public int solution(int[][] dots) {
	        // 평행인 두 선은 기울기가 같다.
	        // 기울기 = y의 값의 증가량을 x의 값의 증가량으로 나눈 값
	        // 두 직선이 겹치는 경우(일치하는 경우)에도 1을 return
	             
	        // 경우 1
	        int y1 = dots[0][1] - dots[1][1];
	        int x1 = dots[0][0] - dots[1][0];
	        double inclination1 = (y1/x1) + (y1%x1);
	        
	        int y2 = dots[2][1] - dots[3][1];
	        int x2 = dots[2][0] - dots[3][0];
	        double inclination2 = (y2/x2) + (y2%x2);
	        
	        if(inclination1 == inclination2){
	            return 1;
	        }
	        
	        
	        // 경우 2
	        y1 = dots[0][1] - dots[2][1];
	        x1 = dots[0][0] - dots[2][0];
	        inclination1 = (y1/x1) + (y1%x1);
	        
	        y2 = dots[1][1] - dots[3][1];
	        x2 = dots[1][0] - dots[3][0];
	        inclination2 = (y2/x2) + (y2%x2);
	        
	        if(inclination1 == inclination2){
	            return 1;
	        }
	        
	        // 경우 3
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
