package programmers;

public class �迭_������ {
	
	class Solution {
	    public int[] solution(int[] num_list) {
	        int l = num_list.length;
	        int[] answer = new int[l];
	        for(int i=1;i<=l; i++){
	            answer[i-1] = num_list[l-i];
	        }
	        return answer;
	    }
	}

}
