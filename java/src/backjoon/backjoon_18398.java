package backjoon;

import java.io.*;
import java.util.Scanner;

public class backjoon_18398 {
    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        for(int i=1; i<=t; i++) {
        	int n= sc.nextInt();
        	for(int j=1; j<=n; j++) {
        		int a= sc.nextInt();
        		int b= sc.nextInt();
        		int result1 = a+b;
        		int result2 = a*b;
        		System.out.println(result1+" "+result2);
        	}
        }
    }   
}

