package programmers;

public class �𽺺�ȣ1 {
	
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
	
//	equals �޼ҵ�� ���ϰ��� �ϴ� ����� ���� ��ü�� ��������,
//
//	== �����ڴ� ���ϰ��� �ϴ� ����� �ּҰ��� ���մϴ�.


}
