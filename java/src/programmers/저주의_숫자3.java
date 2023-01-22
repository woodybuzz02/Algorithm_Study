package programmers;

public class 저주의_숫자3 {
	
	class Solution {
	    public int solution(int n) {
	        int[] x3 = new int[101];
	        x3[0] = 0;
	        for(int i=1; i<=100; i++){
	            x3[i] += x3[i-1]+1;
	            while(true){
	                if(x3[i]%3==0 || Integer.toString(x3[i]).contains("3")){
	                    x3[i] += 1;
	                }else{
	                    break;
	                }  
	            }
	        }
	        int answer = x3[n];
	        return answer;
	    }
	}
	

}
