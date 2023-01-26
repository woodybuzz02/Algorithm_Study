package programmers.Lv1;

public class 자연수_뒤집어_배열로_만들기 {
	
	class Solution {
	    public int[] solution(long n) {
	        String strN = Long.toString(n);
	        String[] splitN = strN.split("");
	        int[] answer = new int[splitN.length];
	        for(int i = splitN.length-1; i>=0; i--){
	            answer[splitN.length-1-i] = Integer.parseInt(splitN[i]);
	        }     
	        return answer;
	    }
	}

}
