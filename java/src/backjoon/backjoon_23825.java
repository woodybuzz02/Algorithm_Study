package backjoon;

import java.io.IOException;
import java.util.Scanner;


public class backjoon_23825 {

	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt()/2;
		int m = sc.nextInt()/2;
		if(n>=m) {
			System.out.println(m);
		}else {
			System.out.println(n);
		}
	}
}

