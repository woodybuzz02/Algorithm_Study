package programmers;
import java.util.*;

public class ���ѼҼ�_�Ǻ��ϱ� {
	

	class Solution {
	    public int solution(int a, int b) {
	        
	        int A = a;
	        int B = b;
	         
	        //��Ŭ���� ȣ����
	        // A�� B�� �ִ������� A�� B�� ���� �������� r �� �� B�� r�� �ִ������� ����.
	        // r�� 0�̸� �׶� b�� �ִ������̴�.
	        int r = 0;
	        
	        while(true){
	            r = a%b;
	            if(r==0){
	                break;
	            }
	            a = b;
	            b = r;
	       }
	        // ���ڿ� �и��� �ִ������� ����ϸ� ���м��� ���� �� �ִ�.
	        A /= b;
	        B /= b;
	        
	        // ���μ������ؼ� 2�� 5�� �ִ��� Ȯ���ϱ�
	        
	        List<Integer> c = new ArrayList<>();
	        
	        for(int i=2; i<=B; i++) 
			{
				while(B%i==0) 
				{
	                c.add(i);
					B/=i;
				}
			}
	        
	        int count2 = Collections.frequency(c, 2);
	        int count5 = Collections.frequency(c, 5);
	        
	        if(c.size() == count2+count5){
	            return 1;
	        }else{
	            return 2;
	        }
	    }
	}

}
