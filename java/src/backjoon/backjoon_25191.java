package backjoon;

import java.util.Scanner;

public class backjoon_25191 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt()/2;
		int C = sc.nextInt();
		
		if(A>=B+C) {
			System.out.println(B+C);
		}else {
			System.out.println(A);
		}
	}

}

