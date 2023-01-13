package backjoon;

import java.io.*;
import java.util.*;

public class backjoon_13597 {
    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	int[] a = new int[2];
    	a[0] = sc.nextInt();
    	a[1] = sc.nextInt();
    	Arrays.sort(a);
    	
    	System.out.println(a[1]);
    }
}
