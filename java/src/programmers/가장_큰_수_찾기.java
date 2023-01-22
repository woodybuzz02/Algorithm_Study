package programmers;
import java.util.*;
import java.util.stream.Collectors;

public class ����_ū_��_ã�� {
	
	class Solution {
	    public int[] solution(int[] array) {
	        
	        int[] answer = new int[2]; 
	        
	        // �迭�� ����Ʈ�� �ٲ�д�.
	        List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());
	        
	        // �迭���� ���� ū �� ã�Ƶд�.
	        Arrays.sort(array);  
	        answer[0] = array[array.length-1];
	        
	        
	        // ū ���� �ε��� ã��(�ٲ�� ����Ʈ ��Ա�)
	        for (int s : list){
	            if(s == answer[0]){
	                answer[1] = list.indexOf(s);
	                return answer;
	            }
	        }
	        
	        return answer;
	    }
	}
	

}

// ����Ʈ -> �迭�� ��ȯ
// ��Ʈ�����ϱ� �ξ� �����ϰ� ���� �Ͱ���.