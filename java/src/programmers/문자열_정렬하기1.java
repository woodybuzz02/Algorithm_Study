package programmers;
import java.util.*;

public class ���ڿ�_�����ϱ�1 {
	
	class Solution {
	    public int[] solution(String my_string) {
	        
	        List<Integer> answer = new ArrayList<Integer>();
	        
	        for(int i=0; i<my_string.length(); i++){
	            char a = my_string.charAt(i);
	            int n = a;
	            if(n < 97){
	               answer.add(my_string.charAt(i) - '0');
	            }
	        }
	        
	        int[] arr = answer.stream().sorted().mapToInt(Integer::intValue).toArray();
	        
	        return arr;
	    }
	}

}

// ����Ʈ -> �迭�� ��ȯ
// ��Ʈ�����ϱ� �ξ� �����ϰ� ���� �Ͱ���.