package backjoon;

import java.io.*;
import java.util.*;

public class backjoon_13752 {
    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	int T = sc.nextInt();
    	for(int i=1;i<=T;i++){
    		System.out.println("=".repeat(sc.nextInt()));
    	}
    }
}

// 문자열 곱하기 "*".repeat(수);