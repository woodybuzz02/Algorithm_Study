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

// ���Ʈ���� ���� - ����Ž�� �˰���. ��, ������ ��� ����� ���� ��� Ž���ϸ鼭 �䱸���ǿ� �����Ǵ� ������� �����´�.
// ��� ����� ���� Ž���ϱ⶧���� �ӵ��� ���� �ɸ� ���̴�. �׷��� BufferedReader ����Ѵ�.

