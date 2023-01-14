package backjoon;

import java.io.IOException;
import java.util.Scanner;


public class backjoon_23037 {

	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		double sum = Math.pow((a%10), 5) + Math.pow((a%100)/10, 5) + Math.pow((a%1000)/100, 5) + Math.pow((a%10000)/1000, 5) + Math.pow((a/10000), 5);
		System.out.println((int)sum);
	}
}

