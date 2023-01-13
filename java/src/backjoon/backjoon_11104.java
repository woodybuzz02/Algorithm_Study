package backjoon;

import java.io.*;
import java.util.Scanner;

public class backjoon_11104 {
    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	int T = sc.nextInt();
    	for(int i=1;i<=T;i++) {
    		String n = sc.next();
    		int num = Integer.parseInt(n, 2);
    		System.out.println(num);
    	}
    }
}

