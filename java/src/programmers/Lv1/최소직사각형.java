package programmers.Lv1;

public class 최소직사각형 {
	
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

// Math.max(), Math.min()을 활용했으면 더 깔끔하게 코드를 짤 수 있다.