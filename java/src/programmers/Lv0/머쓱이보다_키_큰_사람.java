package programmers.Lv0;

public class �Ӿ��̺���_Ű_ū_��� {
	
	
	class Solution {
	    public int solution(int[] array, int height) {
	        int answer = 0;
	        for(int i=0;i<array.length;i++){
	            if(array[i]>height){
	                answer += 1;
	            };
	        }
	        return answer;
	    }
	}

}
