package programmers;

public class 모스부호1 {
	
	class Solution {
	    public String solution(String letter) {
	        String answer = "";
	        String[] a = letter.split(" ");
	        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
	        for(int i=0; i<a.length; i++){
	            for(int j=0; j<morse.length; j++){
	                if(a[i].equals(morse[j])){
	                    char b = (char) (j+97);
	                    answer += b;
	                }
	            }
	        } 
	        return answer;
	    }
	}
	
//	equals 메소드는 비교하고자 하는 대상의 내용 자체를 비교하지만,
//
//	== 연산자는 비교하고자 하는 대상의 주소값을 비교합니다.


}
