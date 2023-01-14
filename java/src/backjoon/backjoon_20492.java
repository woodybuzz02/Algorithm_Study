package backjoon;

import java.io.*;
import java.util.Scanner;

public class backjoon_20492 {
    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
		int coin = sc.nextInt();
		int case1 = (coin*78)/100; 
		int case2 = (coin*80)/100 + ((coin-(coin*80)/100)*78)/100;
		System.out.println(case1+" "+case2);
	}
}
