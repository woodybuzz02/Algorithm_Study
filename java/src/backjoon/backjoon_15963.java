package backjoon;

import java.io.*;
import java.util.Scanner;

public class backjoon_15963 {
    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	long n = sc.nextLong();
    	long m = sc.nextLong();
    	if(n == m) {
    		System.out.println(1);
    	}else {
    		System.out.println(0);
    	}
    }
}

// 10자리 정수까지 들어올 수 있으므로 int의 범위를 넘는다.