package programmers.Lv1;
import java.util.*;

public class Ã¼À°º¹ {
	
	class Solution {
	    public int solution(int n, int[] lost, int[] reserve) {
	        
	        int[] clothes = new int[n+1];
	        Arrays.fill(clothes, 1);
	        
	        for(int i : lost){
	            clothes[i]--;
	        }
	        
	        for(int i : reserve){
	            clothes[i]++; 
	        }
	        
	        for(int i = 1; i<=n; i++){
	            if(i == 1){
	                if(clothes[i] > 1 && clothes[i+1] == 0){
	                    clothes[i]--;
	                    clothes[i+1]++;
	                }
	            }else if(i == n){
	                if(clothes[i] > 1 && clothes[i-1] == 0){
	                    clothes[i]--;
	                    clothes[i-1]++;
	                }
	            }else{
	                if(clothes[i] > 1 && clothes[i-1] == 0){
	                    clothes[i]--;
	                    clothes[i-1]++;
	                }else if(clothes[i] > 1 && clothes[i+1] == 0){
	                    clothes[i]--;
	                    clothes[i+1]++;
	                }
	            }
	        }
	        
	        int answer = 0;
	        for (int element : clothes) {
	            if(element > 0){
	                answer ++;
	            }
	        }
	        return answer-1;
	    }
	}
	
}
