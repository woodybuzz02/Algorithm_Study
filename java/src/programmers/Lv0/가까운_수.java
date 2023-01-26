package programmers.Lv0;
import java.lang.Math;
import java.util.*;

public class 가까운_수 {

	class Solution {
	    public int solution(int[] array, int n) {
	        
	        List<Integer> distance = new ArrayList<>();
	        
	        for(int arrayN : array){
	            distance.add(Math.abs(n-arrayN));
	        }
	        
	        Collections.sort(distance); // 오름차순으로 정렬
	        
	        int min = distance.get(0); // 거리차이가 min인 것 중 값이 적은 것을 출력!
	        
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
