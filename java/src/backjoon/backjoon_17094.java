package backjoon;

import java.io.*;
import java.util.Scanner;

public class backjoon_17094 {
    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	int T = sc.nextInt();
    	String k = sc.next();
    	int enumber = 0;
    	for(int i=0;i<T;i++) {
    		char e = k.charAt(i);
    		if(e == 'e') {
    			enumber ++ ;
    		}
    	}
    	int number2 = T-enumber;
    	if(enumber>number2) {
    		System.out.println("e");
    	}else if(enumber==number2) {
    		System.out.println("yee");
    	}else {
    		System.out.println("2");
    	}
    }
}
