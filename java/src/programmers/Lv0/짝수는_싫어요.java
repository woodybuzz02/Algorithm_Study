package programmers.Lv0;

public class Â¦¼ö´Â_½È¾î¿ä {
	
	class Solution {
	    public int[] solution(int n) {
	        if(n%2!=0){
	            n += 1;
	        }
	        int[] answer = new int[n/2];
	        answer[0] = 1;
	        for(int i=1; i<n/2; i++){
	            answer[i] = 1+(2*i);
	        } 
	        return answer;
	    }
	}

}
