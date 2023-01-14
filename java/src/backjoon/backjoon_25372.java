package backjoon;

import java.io.IOException;
import java.util.Scanner;


public class backjoon_25372 {

	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=1;i<=T;i++){
			String m = sc.next();
			int n = m.length();
			if(n>=6 && n<=9) {
				System.out.println("yes");
			}else {
				System.out.println("no");
			}
			
		}
	}

}

