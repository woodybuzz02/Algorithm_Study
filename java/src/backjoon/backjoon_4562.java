package backjoon;

import java.util.Scanner;

public class backjoon_4562 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(a >= b) {
				System.out.println("MMM BRAINS");
			} 
			else {
				System.out.println("NO BRAINS");
			}
		}
	}

}
