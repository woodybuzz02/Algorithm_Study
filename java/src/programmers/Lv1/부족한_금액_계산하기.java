package programmers.Lv1;

public class 부족한_금액_계산하기 {
	
	class Solution {
	    public long solution(int price, int money, int count) {
	        long sum = 0;
	        for(int i = 1; i<=count; i++){
	            sum += (price*i);
	        }
	        return sum-money >= 0 ? sum-money : 0;
	    }
	}

}
