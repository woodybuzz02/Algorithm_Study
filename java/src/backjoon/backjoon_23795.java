package backjoon;

import java.io.IOException;
import java.util.Scanner;


public class backjoon_23795 {

	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		while(true) {
			int n = sc.nextInt();
			if(n==-1) {
				break;
			}
			sum += n;
		}
		System.out.println(sum);
	}
}

