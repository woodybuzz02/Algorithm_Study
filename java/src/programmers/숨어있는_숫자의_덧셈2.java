package programmers;

public class �����ִ�_������_����2 {
	
	class Solution {
	    public int solution(String my_string) {
	    	
	        char[] c = my_string.toCharArray();
	        for(int i=0; i<c.length; i++){
	            int a = c[i];
	            String b = "";
	            b += c[i];
	            if(a>=65){
	                my_string = my_string.replace(b," ");
	            }
	        }
	        my_string = my_string.replaceAll("\\s+", " ");
	        my_string = my_string.trim();
	        // ���Խ� "\s"�� ������ ���� ������ ����(white space)�� ��Ÿ���ϴ�.
	        // (\t, \n, \x0B, \f, \r)
	        // �׸��� "+"�� 1���̻��� �ǹ��մϴ�.
	        // ��, "\s+"�� 1�� �̻��� ������ �ǹ��մϴ�.
	        int answer = 0;
	        if(my_string.equals("")){
	            return 0;
	        }else{
	            String[] b = my_string.split(" ");
	           
	            for(int i=0; i<b.length; i++){
	                answer += Integer.parseInt(b[i]); 
	            } 
	        }
	        return answer;
	    }
	}
	

}
