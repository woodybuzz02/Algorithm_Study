package backjoon;

import java.util.Scanner;

public class backjoon_5217 {
	

	    public static void main(String[] args) {
	       Scanner sc = new Scanner(System.in); 
	       int T = sc.nextInt(); // 테스트 케이스
	       int sw = 0;
	       
	       for(int i=0; i<T ; i++) {
	           String temp="Pairs for ";
	           int n = sc.nextInt(); // 1보다 크거나 같고 12보다 작거나 같은 자연수 n
	           System.out.print(temp+n+':'); // 공통적으로 들어가는 "Pairs for"을 반복문의 처음에 출력          
	           for(int j=1;j<n;j++) {
	               for(int k=j+1;k<n;k++) {
	                   if(j<k && j!=k && j+k==n &&sw==0) {
	                       System.out.print(" "+j+" "+k);
	                       sw=1;} // 두개 이상일때만 출력해야하므로 스위치 역할을 하는 sw를 선언해서 2개이상일때만 출력
	                   else if(j<k && j!=k && j+k==n && sw==1) {
	                           System.out.print(", "+j+" "+k);
	                           sw=1;  
	                   }
	               }
	           }
	           sw=0;
	           System.out.println();
	       }
	       
	}	
	
}


