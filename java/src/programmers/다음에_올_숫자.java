package programmers;

public class 다음에_올_숫자 {
	
	class Solution {
	    public int solution(int[] common) {
	        
	        int last = common[common.length-1];
	        // 등차인지 등비인지 구별하기
	        if(common[1] - common[0] == common[2] - common[1]){
	            // true 등차
	            return last+(common[1] - common[0]);
	        }else{
	            // false 등비
	            // 등비 수열이 항상 첫항의 제곱으로 가는건 아니다.
	            // 1 2 4경우도 있다고 한다.
	            return last*(common[2]/common[1]);
	        }  
	    }
	}

}
