package backjoon;

import java.io.*;
import java.util.Scanner;

public class backjoon_20499 {
    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
		String w1 = sc.next();
		String[] result = w1.split("/");
		int result1 = Integer.parseInt(result[0])+Integer.parseInt(result[2]);
		int result2 = Integer.parseInt(result[1]);
		if(result1<result2 || result2==0) {
			System.out.println("hasu");
		}else {
			System.out.println("gosu");
		}
	}
}
