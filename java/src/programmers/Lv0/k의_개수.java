package programmers.Lv0;

public class kÀÇ_°³¼ö {
	
	class Solution {
	    public int solution(int i, int j, int k) {
	        int answer = 0;
	        for(int n=i; n<=j; n++){
	            String s = Integer.toString(n);
	            for(int sIndex=0; sIndex<s.length(); sIndex++){
	                int sInt = s.charAt(sIndex) - '0';
	                if(sInt == k){
	                    answer++; 
	                };
	            };
	        }
	        return answer;
	    }
	}

}
