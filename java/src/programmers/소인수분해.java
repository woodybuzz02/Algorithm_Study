package programmers;
import java.util.*;

public class 소인수분해 {
	
	class Solution {
	    public int[] solution(int n) {
	        
	        // 소수 구하기
	        
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
	        
	        // 나눠지는 소수 찾기
	        
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
