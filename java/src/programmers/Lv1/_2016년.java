package programmers.Lv1;

public class _2016년 {
	
	class Solution {
	    // 윤년 2월 29일을 추가
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
