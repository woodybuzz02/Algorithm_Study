package programmers;

public class �߶�_�迭��_�����ϱ� {
	
	class Solution {
	    public String[] solution(String my_str, int n) {
	        
	        StringBuffer sb = new StringBuffer();
	        
	        sb.append(my_str);
	        
	        for(int i=1; i<=my_str.length()/n; i++){
	            sb.insert((n*i)+(i-1), " ");
	        }
	        
	        my_str = sb.toString();
	        
	        String[] list = my_str.split(" ");
	        
	        return list;
	    }
	}
	
}

// StringBuffer�� ����Ͽ� �߰��� ������ �ְ� ������ �������� �ڸ���.