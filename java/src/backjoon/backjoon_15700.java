package backjoon;

import java.io.*;
import java.util.Scanner;

public class backjoon_15700 {
    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	long n = sc.nextLong();
    	long m = sc.nextLong();
    	long nm = n*m;
    	System.out.println(nm/2);
    }
}
