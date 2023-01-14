package backjoon;

import java.io.IOException;
import java.util.Scanner;


public class backjoon_24568 {

	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		if((n*8)+(m*3) >= 28) {
			System.out.println((n*8)+(m*3)-28);
		}else {
			System.out.println(0);
		}
	}
}

