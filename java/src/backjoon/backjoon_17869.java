package backjoon;

import java.io.*;
import java.util.Scanner;

public class backjoon_17869 {
    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	long n = sc.nextLong();
    	int sum = 0;
    	while(true) {
    		if(n==1) {
    			break;
    		}
    		if(n%2==0) {
    			n = n/2;
    			sum += 1;
    		}else {
    			n += 1;
    			sum += 1;
    		}
    	}
    	System.out.println(sum);
    }
}
