package backjoon;

import java.io.*;
import java.util.Scanner;

public class backjoon_17388 {
    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	int s = sc.nextInt();
    	int k = sc.nextInt();
    	int y = sc.nextInt();
    	if(s+k+y >= 100) {
    		System.out.println("OK");
    	}else if(s<k && s<y) {
    		System.out.println("Soongsil");
    	}else if(k<s && k<y) {
    		System.out.println("Korea");
    	}else {
    		System.out.println("Hanyang");
    	}
    }
}
