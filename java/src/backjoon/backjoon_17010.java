package backjoon;

import java.io.*;
import java.util.Scanner;

public class backjoon_17010 {
    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	int T = sc.nextInt();
    	for(int i=1; i<=T; i++) {
    		int a1 = sc.nextInt();
    		String a2 = sc.next();
    		System.out.println(a2.repeat(a1));
    	}
    }
}
