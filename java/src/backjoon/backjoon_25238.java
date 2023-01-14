package backjoon;

import java.io.IOException;
import java.util.Scanner;


public class backjoon_25238 {

	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int p = 100 - sc.nextInt();
		int c = (n*p)/100;
		if(n < 100){
			System.out.println(1);
		}else if( c >= 100) {
			System.out.println(0);
		}else {
			System.out.println(1);
		}	
	}
}

