package programmers;

public class �ռ���_ã�� {
	
	class Solution {
	    public int solution(int n) {
	        
	        int[] arr = new int[101];
	        
	        // ��� ���� ���ϰ� �迭�� ����
	        for(int i=1; i<=100; i++){
	            int count =0;
	            for(int j=1; j<=i; j++){
	                if(i%j == 0){
	                    count++;
	                    arr[i] = count;             }
	            }
	       }
	        
	        // �ռ��� ���� ã��
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
