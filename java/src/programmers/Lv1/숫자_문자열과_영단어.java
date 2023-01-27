package programmers.Lv1;

public class 숫자_문자열과_영단어 {
	
	class Solution {
	    public int solution(String s) {
	        s = s.replace("zero","0");
	        s = s.replace("one","1");
	        s = s.replace("two","2");
	        s = s.replace("three","3");
	        s = s.replace("four","4");
	        s = s.replace("five","5");
	        s = s.replace("six","6");
	        s = s.replace("seven","7");
	        s = s.replace("eight","8");
	        s = s.replace("nine","9");
	        int answer = Integer.parseInt(s);
	        return answer;
	    }
	}


	// class Solution {
//	     public int solution(String s) {
//	         String[] strArr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
//	         for(int i = 0; i < strArr.length; i++) {
//	             s = s.replaceAll(strArr[i], Integer.toString(i));
//	         }
//	         return Integer.parseInt(s);
//	     }
	// }

}
