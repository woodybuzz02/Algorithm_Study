package programmers.Lv1;

public class �ּ����簢�� {
	
	class Solution {
	    public int solution(int[][] sizes) {
	        
	        int a = 0;
	        int b = 0;
	        
	        for(int[] size : sizes){
	            if(size[0] > size[1]){
	                if(a <= size[0]){
	                    a = size[0];
	                }
	                if(b <= size[1]){
	                    b = size[1];
	                }
	            }else{
	                if(a <= size[1]){
	                    a = size[1];
	                }
	                if(b <= size[0]){
	                    b = size[0];
	                }
	            }
	        }
	        
	        return a*b;
	    }
	}
	
}

// Math.max(), Math.min()�� Ȱ�������� �� ����ϰ� �ڵ带 © �� �ִ�.