package programmers.Lv0;

public class 삼각형의_완성조건2 {

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
	            // sides의 요소들의 값이 같은 경우
	            a = sides[0];
	            b = sides[1];
	        }
	        
	        // a가 가장 긴 변이라고 했을 때 가장 긴 변의 길이는 다른 두 변의 길이의 합보다 작아야 합니다.
	        // 그렇다면 가장 긴 변의 길이가 6이라고 하고 b=3이라고 했을 때 a < b + c && a >= c 여야 합니다.
	        
	        for(int i = a-b+1; i<=a; i++){
	            count++;
	        }
	        
	        // c가 가장 긴 변이라고 했을 때 c < a + b && a < c 여야 합니다.
	        
	       for(int i = a+1; i<a+b; i++){
	            count++;
	        }

	        return count;
	    }
	}

}
