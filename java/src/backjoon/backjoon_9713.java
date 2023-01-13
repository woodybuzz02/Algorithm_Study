package backjoon;

import java.io.*;
import java.util.Scanner;

public class backjoon_9713 {
    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	int T = sc.nextInt();
    	
        for(int i=1; i<=T; i++){
        	int a = sc.nextInt();
        	int sum = 0;
        	for(int j=1; j<=a; j+=2) {
        		sum += j;
        	}
        	System.out.println(sum);
        }
        
    }
}

