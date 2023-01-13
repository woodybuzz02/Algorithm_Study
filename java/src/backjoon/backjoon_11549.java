package backjoon;

import java.io.*;
import java.util.*;

public class backjoon_11549 {
    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	int T = sc.nextInt();
    	int n = 0;
    	for(int i=1;i<=5;i++) {
    		if(T == sc.nextInt()) {
    			n++;
    		}
    	}
    	System.out.println(n);
    }
}
