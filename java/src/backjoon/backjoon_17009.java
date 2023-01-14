package backjoon;

import java.io.*;
import java.util.Scanner;

public class backjoon_17009 {
    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	int a3 = sc.nextInt()*3;
    	int a2 = sc.nextInt()*2;
    	int a1 = sc.nextInt()*1;
    	int a = a1+a2+a3;
    	int b3 = sc.nextInt()*3;
    	int b2 = sc.nextInt()*2;  	
    	int b1 = sc.nextInt()*1;
    	int b = b1+b2+b3;
    	if(a>b) {
    		System.out.println("A");
    	}else if(a==b){
    		System.out.println("T");
    	}else {
    		System.out.println("B");
    	}
    }
}
