package programmers;
import java.util.*;

public class ��_������ {

	class Solution {
	    public int solution(int[] numbers, int k) {
	        
	        List<Integer> intList = new ArrayList<>();
	        
	        for(int i = 1; i<=k; i++){
	            for(int in : numbers){
	                intList.add(in);
	            }
	        }
	        
	        // k��°�� ���� ������ ����� ��ȣ
	        int n = 2*(k-1);
	        
	        int answer = intList.get(n);
	        
	        return answer;
	    }
	}

}
