package backjoon;

import java.io.*;
import java.util.Scanner;

public class backjoon_17530 {
    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int a = 0;
    	int answer = 0;
    	for(int i=1; i<=n; i++) {
    		int a1 = sc.nextInt();
    		if(a1 > a) {
    			a = a1;
    			answer = i;
    		}
    	}
    	if(answer==1) {
    		System.out.println("S");
    	}else {
    		System.out.println("N");
    	}
    }
}
