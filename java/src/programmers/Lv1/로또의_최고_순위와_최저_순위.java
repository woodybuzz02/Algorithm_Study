package programmers.Lv1;
import java.util.*;
import java.util.stream.Collectors;

public class 로또의_최고_순위와_최저_순위 {
	
	class Solution {
	    public int[] solution(int[] lottos, int[] win_nums) {
	        List<Integer> lottosList 
	                = Arrays.stream(lottos)
	                        .boxed()
	                        .collect(Collectors.toList());
	        int zero = Collections.frequency(lottosList, 0);
	        List<Integer> win_numsList 
	                = Arrays.stream(win_nums)
	                        .boxed()
	                        .collect(Collectors.toList());
	        lottosList.retainAll(win_numsList);
	        int maxNum = lottosList.size()+zero;
	        int minnum = lottosList.size();
	        int maxRank = rank(maxNum);
	        int minRank = rank(minnum);

	        int[] answer = {maxRank,minRank};
	        return answer;
	    }
	    
	    private int rank(int num){
	       switch(num) {
	            case 6: 
	                return 1;
	            case 5 : 
	                return 2;
	            case 4 : 
	                return 3;
	            case 3 : 
	                return 4;
	            case 2 :
	                return 5;
	            default :
	                return 6;
	        }
	    }
	}
	
}
