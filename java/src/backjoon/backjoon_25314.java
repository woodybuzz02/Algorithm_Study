package backjoon;

import java.io.IOException;
import java.util.Scanner;


public class backjoon_25314 {

	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c = n/4;
		int d = n%4;
		if(d != 0) {
			c += 1;
		}
		System.out.println("long ".repeat(c)+"int");
	}
}

