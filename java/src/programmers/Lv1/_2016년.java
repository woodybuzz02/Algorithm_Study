package programmers.Lv1;

public class _2016�� {
	
	class Solution {
	    // ���� 2�� 29���� �߰�
	    public String solution(int a, int b) {
	        
	        int sumDay = 0;
	        
	        int[] monthDay = {31,29,31,30,31,30,31,31,30,31,30,31};
	        
	        for(int i = 0; i<a-1; i++){
	            sumDay += monthDay[i];
	        }
	        sumDay += b;
	        
	        String[] yoil = {"THU","FRI","SAT","SUN","MON","TUE","WED"};
	        
	        return yoil[sumDay%7];
	    }
	}
	
}
