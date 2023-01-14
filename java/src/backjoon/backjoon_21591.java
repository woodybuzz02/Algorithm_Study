package backjoon;

import java.io.*;
import java.util.Scanner;

public class backjoon_21591 {
    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
		int w1 = sc.nextInt()-2;
		int h1 = sc.nextInt()-2;
		int w2 = sc.nextInt();
		int h2 = sc.nextInt();
		if(w1>=w2 && h1>=h2) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
    }
}
