package programmers.Lv0;

public class Â¦¼ö_È¦¼ö_°³¼ö {
	
	class Solution {
	    public int[] solution(int[] num_list) {
	        int x = 0;
	        int y = 0;
	        for(int i=0;i<num_list.length;i++){
	            if(num_list[i]%2==0){
	                x += 1;
	            }else{
	                y += 1;
	            }
	        }
	        int[] answer = {x, y};
	        return answer;
	    }
	}

}
