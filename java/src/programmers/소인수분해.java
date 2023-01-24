package programmers;
import java.util.*;

public class ���μ����� {
	
	class Solution {
	    public int[] solution(int n) {
	        
	        // �Ҽ� ���ϱ�
	        
	        List<Integer> decimalList = new ArrayList<>();
	        
	        for(int i=2; i<=n; i++){
	            int count = 0;
	            for(int j=1; j<=i; j++){
	                if(i%j==0){
	                    count++;
	                }
	            }
	            if(count==2){
	                    decimalList.add(i);
	                }
	        }
	        
	        // �������� �Ҽ� ã��
	        
	        List<Integer> nDecimalList = new ArrayList<>();
	        
	        for(int decimal : decimalList){
	            if(n%decimal==0){
	                nDecimalList.add(decimal);
	            }
	        }
	        
	        int[] answer = nDecimalList.stream()
	                .mapToInt(Integer::intValue)
	                .toArray();

	        return answer;
	    }
	}	

}
