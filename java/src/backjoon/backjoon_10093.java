package backjoon;

import java.io.*;
import java.util.Scanner;

public class backjoon_10093 {
    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	int a = sc.nextInt();
    	int b = sc.nextInt();
        if(a>b) {
            System.out.println(a-b-1);
        	for(long i = b+1; i<a; i++) System.out.print(i+" "); 
        }else if(a<b) {
            System.out.println(b-a-1);
        	for(long i = a+1; i<b; i++) System.out.print(i+" ");
        }else {
        	System.out.println(0);
        }
        
    }
}

