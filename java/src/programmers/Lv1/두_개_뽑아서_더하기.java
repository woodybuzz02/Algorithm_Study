package programmers.Lv1;
import java.util.*;

public class ��_��_�̾Ƽ�_���ϱ� {
	
	class Solution {
	    public int[] solution(int[] numbers) {
	        List<Integer> sumNum = new ArrayList<>();
	        for(int i=0; i<numbers.length-1; i++){
	            for(int j=i+1; j<numbers.length; j++){
	                sumNum.add(numbers[i]+numbers[j]);
	            }
	        }
	        int[] answer = sumNum.stream().distinct().sorted().mapToInt(i->i).toArray();
	        return answer;
	    }
	}
	
}
