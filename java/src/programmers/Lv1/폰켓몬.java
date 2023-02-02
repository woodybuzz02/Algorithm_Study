package programmers.Lv1;
import java.util.*;

public class ÆùÄÏ¸ó {
	
	class Solution {
	    public int solution(int[] nums) {
	        HashSet<Integer> set = new HashSet<Integer>();
	        for(int i=0; i<nums.length; i++){
	            set.add(nums[i]);
	        }
	        
	        if(set.size() <= (nums.length/2)) {
	            return set.size();
	        }else{
	            return nums.length/2;
	        }

	    }
	}
	
}
