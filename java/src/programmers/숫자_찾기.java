package programmers;

public class 숫자_찾기 {
	
	
	class Solution {
	    public int solution(int num, int k) {
	        String a = Integer.toString(num);
	        char b =  (char) (k+'0');
	        int answer = 0;
	        for(int i=0; i<a.length(); i++){
	            if(a.charAt(i)==b){
	                return answer = i+1;
	            }
	        }
	        return -1;
	    }
	}

}
