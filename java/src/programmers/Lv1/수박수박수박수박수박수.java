package programmers.Lv1;

public class ���ڼ��ڼ��ڼ��ڼ��ڼ� {
	
	class Solution {
	    public String solution(int n) {
	        
	        String ans = "����";
	        
	        if(n%2 == 0){
	            return ans.repeat(n/2);
	        }else{
	            return ans.repeat(n/2) + "��";
	        }

	    }
	}

}
