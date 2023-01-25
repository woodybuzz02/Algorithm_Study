package programmers;
import java.util.*;

public class 유한소수_판별하기 {
	

	class Solution {
	    public int solution(int a, int b) {
	        
	        int A = a;
	        int B = b;
	         
	        //유클리드 호제법
	        // A와 B의 최대공약수는 A를 B로 나눈 나머지가 r 일 때 B와 r의 최대공약수와 같다.
	        // r이 0이면 그때 b가 최대공약수이다.
	        int r = 0;
	        
	        while(true){
	            r = a%b;
	            if(r==0){
	                break;
	            }
	            a = b;
	            b = r;
	       }
	        // 분자와 분모의 최대공약수로 약분하면 기약분수를 만들 수 있다.
	        A /= b;
	        B /= b;
	        
	        // 소인수분해해서 2와 5만 있는지 확인하기
	        
	        List<Integer> c = new ArrayList<>();
	        
	        for(int i=2; i<=B; i++) 
			{
				while(B%i==0) 
				{
	                c.add(i);
					B/=i;
				}
			}
	        
	        int count2 = Collections.frequency(c, 2);
	        int count5 = Collections.frequency(c, 5);
	        
	        if(c.size() == count2+count5){
	            return 1;
	        }else{
	            return 2;
	        }
	    }
	}

}
