package backjoon;

import java.io.IOException;
import java.util.Scanner;


public class backjoon_22966 {

	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String b = sc.next();
		int c = sc.nextInt();
		for(int i=1;i<=a-1;i++) {
			String d = sc.next();
			int e = sc.nextInt();
			if(c > e) {
				c = e;
				b = d;
			}
		}
		System.out.println(b);	
	}
}

