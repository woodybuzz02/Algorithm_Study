package backjoon;

import java.io.*;
import java.util.Scanner;

public class backjoon_15963 {
    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int m = sc.nextInt();
    	if(n == m) {
    		System.out.println(1);
    	}else {
    		System.out.println(0);
    	}
    }
}

