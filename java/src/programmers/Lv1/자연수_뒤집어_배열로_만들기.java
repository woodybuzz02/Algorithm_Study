package programmers.Lv1;

public class �ڿ���_������_�迭��_����� {
	
	class Solution {
	    public int[] solution(long n) {
	        String strN = Long.toString(n);
	        String[] splitN = strN.split("");
	        int[] answer = new int[splitN.length];
	        for(int i = splitN.length-1; i>=0; i--){
	            answer[splitN.length-1-i] = Integer.parseInt(splitN[i]);
	        }     
	        return answer;
	    }
	}

}
