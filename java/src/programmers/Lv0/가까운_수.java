package programmers.Lv0;
import java.lang.Math;
import java.util.*;

public class �����_�� {

	class Solution {
	    public int solution(int[] array, int n) {
	        
	        List<Integer> distance = new ArrayList<>();
	        
	        for(int arrayN : array){
	            distance.add(Math.abs(n-arrayN));
	        }
	        
	        Collections.sort(distance); // ������������ ����
	        
	        int min = distance.get(0); // �Ÿ����̰� min�� �� �� ���� ���� ���� ���!
	        
	        Arrays.sort(array);
	        
	        int answer = 0;
	        
	        for(int i=0; i<array.length; i++){
	            if(Math.abs(n-array[i]) == min){
	                answer = array[i];
	                break;
	            }
	        }
	        
	        return answer;
	    }
	}

}
