package backjoon;

import java.util.Scanner;

public class backjoon_6810 {
	
	public static void main(String[] args) {
		int num = 9*1+7*3+8*1+0*3+9*1+2*3+1*1+4*3+1*1+8*3;
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		num += (a*1+b*3+c*1);
		System.out.println("The 1-3-sum is "+num);
	}	
	
}


