package programmers.Lv1;

public class 나머지가_1이_되는_수_찾기 {
	
	class Solution {
	    public int solution(int n) {
	        
	        int i = 1;
	        
	        while(n%i != 1){
	            i++;
	        }
	        
	        return i;
	    }
	}

}
