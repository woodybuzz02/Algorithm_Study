package programmers.Lv0;

public class 중복된_숫자_개수 {
	
	
	class Solution {
	    public int solution(int[] array, int n) {
	        int answer = 0;
	        for(int i = 0;i<array.length;i++){
	            if(array[i]==n){
	                answer +=1;
	            }
	        }
	        return answer;
	    }
	}

}
