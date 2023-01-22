package programmers;

public class 잘라서_배열로_저장하기 {
	
	class Solution {
	    public String[] solution(String my_str, int n) {
	        
	        StringBuffer sb = new StringBuffer();
	        
	        sb.append(my_str);
	        
	        for(int i=1; i<=my_str.length()/n; i++){
	            sb.insert((n*i)+(i-1), " ");
	        }
	        
	        my_str = sb.toString();
	        
	        String[] list = my_str.split(" ");
	        
	        return list;
	    }
	}
	
}

// StringBuffer를 사용하여 중간에 공백을 넣고 공백을 기준으로 자른다.