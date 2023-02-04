package programmers.Lv1;

public class 크기가_작은_부분문자열 {
	
	class Solution {
	    public int solution(String t, String p) {
	        int answer = 0;
	        Long b = Long.parseLong(p);
	        
	        for(int i=0; i<=t.length()-p.length(); i++){
	            String str = t.substring(i, i+p.length());
	            Long a = Long.parseLong(str);
	            if(a <= b){
	                answer++;
	            }
	        }
	        
	        return answer;
	    }
	}
	
}
