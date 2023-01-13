package backjoon;

import java.io.*;
import java.util.*;

public class backjoon_11319 {
    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	int T = sc.nextInt();
    	for(int i=0;i<=T;i++) {
    		String input = sc.nextLine().trim().toLowerCase().replaceAll(" ","");
    		int mo = 0;
    		for(int j=0;j<input.length();j++){
    			if(input.charAt(j)=='a'||input.charAt(j)=='e'||input.charAt(j)=='i'||input.charAt(j)=='o'||input.charAt(j)=='u'){
    				mo++;
    			}
    		}
    		if(input.length()-mo!=0 || mo!=0){
    			System.out.println(input.length()-mo+" "+mo);
    		}
    		
    	}
    }
}

// trim() 입력받은 글자 공백을 없애준다.
// toLowerCase() 소문자로 변환 toUpperCase() 대문자로 변환
// replaceAll() 함수는 대상 문자열을 원하는 문자 값으로 변환하는 함수
// charAt() str을 char타입으로 변환하는 과정  ( )안에 숫자가 들어간 것 문자열에서 문자의 순서를 나타내는 것
