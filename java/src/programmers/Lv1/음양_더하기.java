package programmers.Lv1;

public class 음양_더하기 {
	
	class Solution {
	    public int solution(int[] absolutes, boolean[] signs) {
	        
	        int answer = 0;
	        
	        for(int i=0; i<signs.length; i++){
	            if(signs[i] == true){
	                answer += absolutes[i];
	            }else{
	                answer -= absolutes[i]; 
	            }
	        }
	        return answer;
	    }
	}

}
