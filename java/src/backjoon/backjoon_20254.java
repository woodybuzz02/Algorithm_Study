package backjoon;

import java.io.*;
import java.util.Scanner;

public class backjoon_20254 {
    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	int ur= sc.nextInt()*56;
    	int tr= sc.nextInt()*24;
    	int uo= sc.nextInt()*14;
    	int to= sc.nextInt()*6;
    	System.out.println(ur+tr+uo+to);
    }
}

