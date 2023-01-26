package programmers.Lv0;

public class 제곱수_판별하기 {
	
	class Solution {
	    public int solution(int n) {
	        for(int i=1; i<=1000000; i++){
	            if(i*i == n){
	                return 1;
	            }
	        }
	        return 2;
	    }
	}

}
