package programmers;

public class 합성수_찾기 {
	
	class Solution {
	    public int solution(int n) {
	        
	        int[] arr = new int[101];
	        
	        // 약수 개수 구하고 배열에 넣음
	        for(int i=1; i<=100; i++){
	            int count =0;
	            for(int j=1; j<=i; j++){
	                if(i%j == 0){
	                    count++;
	                    arr[i] = count;             }
	            }
	       }
	        
	        // 합성수 개수 찾기
	        int answer = 0;
	        for(int i=1; i<=n; i++){
	            if(arr[i] > 2){
	                answer++;
	            }
	        }
	        return answer;
	    }
	}
	
}
