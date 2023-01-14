package backjoon;

import java.io.*;
import java.util.Scanner;

public class backjoon_19602 {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int a= Integer.parseInt(s[0]);
        int b= Integer.parseInt(s[1]);
        int c= Integer.parseInt(s[2]);
        int d= Integer.parseInt(s[3]);
        int e= Integer.parseInt(s[4]);
        int f= Integer.parseInt(s[5]);
		int x=0;
		int y=0;
		for(int i=-999; i<1000; i++) {
			for(int j=-999; j<1000; j++) {
				if((a*i)+(b*j)==c && (d*i)+(e*j)==f) {
					x = i;
					y = j;
					break;
				}
			}
		}
		System.out.println(x+" "+y);
	}
}

// 브루트포스 문제 - 완전탐색 알고리즘. 즉, 가능한 모든 경우의 수를 모두 탐색하면서 요구조건에 충족되는 결과만을 가져온다.
// 모든 경우의 수를 탐색하기때문에 속도가 오래 걸릴 것이다. 그래서 BufferedReader 사용한다.

