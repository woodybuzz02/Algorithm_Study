package programmers;

public class ���簢��_����_���ϱ� {
	
	class Solution {
	    public int solution(int[][] dots) {
	        int xmax = dots[0][0];
	        int xmin =  dots[0][0];
	        int ymax = dots[0][1];
	        int ymin =  dots[0][1];
	        for(int i = 0; i < dots.length; i++){
	            if(xmax <= dots[i][0]){
	                xmax = dots[i][0];
	            }else{
	                xmin =  dots[i][0];
	            }
	            if(ymax <= dots[i][1]){
	                ymax = dots[i][1];
	            }else{
	                ymin =  dots[i][1];
	            }
	        }
	        int x = xmax - xmin;
	        int y = ymax - ymin;
	        return x*y;
	        
	        // x��ǥ���� ���� ���� ���� ���� ū �� ������ �Ÿ� = x
	        // y��ǥ���� ���� ���� ���� ���� ū �� ������ �Ÿ� = y
	    }
	}

}
