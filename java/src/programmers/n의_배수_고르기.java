package programmers;
import java.util.*;

public class n��_���_���� {
	
	class Solution {
	    public int[] solution(int n, int[] numlist) {
	        
	        // n�� ����� �ƴ� ������ ����
	        
	        // n�� ����� ��Ƶ� ����Ʈ ����
	        List<Integer> a = new ArrayList<>();
	        
	        for(int i=0; i<numlist.length; i++){
	            if(numlist[i]%n==0){
	                a.add(numlist[i]);
	            } 
	        }
	        
	        // Stream�� ����Ͽ� Integer ����� Java�� �⺻ ���� ��̷� ��ȯ
	        int[] answer = a.stream().mapToInt(Integer::intValue).toArray();
	        
	        return answer;
	    }
	}
	
}
