package programmers.Lv1;

public class �ִ�������_�ּҰ���� {
	
//	class Solution {
	    public int[] solution(int n, int m) {
	        
	        int[] answer = new int[2];
	        
	        answer[0] = gcd(n,m);
	        answer[1]= n*m/answer[0];
	        
	        return answer;
	    }
	    
	    private static int gcd(int a, int b){
	        if(b == 0) return a;
	        return gcd(b, a % b);
	    }
//	}

}
