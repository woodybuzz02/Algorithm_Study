package backjoon;

import java.util.Scanner;

public class backjoon_4892 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 1;
		while(true) {
			int n0 = sc.nextInt();
			if(n0 == 0) {
				break;
			}else {
				int n1 = 3*n0;
				if(n1%2 == 0){
					int n2 = (n1+1)/2;
					int n3 = 3*n2;
					int n4 = n3/9;
					System.out.println(n+". "+"even"+" "+n4);
				}else {
					int n2 = n1/2;
					int n3 = 3*n2;
					int n4 = n3/9;
					System.out.println(n+". "+"odd"+" "+n4);
				}
				n++;
			}
		}	
	}
}
