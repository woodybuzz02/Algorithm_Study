package programmers;
import java.util.*;

public class n의_배수_고르기 {
	
	class Solution {
	    public int[] solution(int n, int[] numlist) {
	        
	        // n의 배수가 아닌 수들을 제거
	        
	        // n의 배수를 담아둘 리스트 생성
	        List<Integer> a = new ArrayList<>();
	        
	        for(int i=0; i<numlist.length; i++){
	            if(numlist[i]%n==0){
	                a.add(numlist[i]);
	            } 
	        }
	        
	        // Stream을 사용하여 Integer 목록을 Java의 기본 정수 어레이로 변환
	        int[] answer = a.stream().mapToInt(Integer::intValue).toArray();
	        
	        return answer;
	    }
	}
	
}
