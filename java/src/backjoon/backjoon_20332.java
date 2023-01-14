package backjoon;

import java.io.*;
import java.util.Scanner;

public class backjoon_20332 {
    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
		int numcon = sc.nextInt();
		int prize = 0;
		for(int i=1;i<=numcon;i++) {
			prize += sc.nextInt();
		}
		if(prize%3 != 0) {
			System.out.println("no");
		}else {
			System.out.println("yes");
		}
		
	}
}
