package backjoon;

import java.io.IOException;
import java.util.Scanner;


public class backjoon_21612 {

	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();
		int p = 5*b-400;
		System.out.println(p);
		if (p<100) {
            System.out.println("1");
        }else if(p>100){
            System.out.println("-1");
        }else {
        	System.out.println("0");
        }
	}
}

// 원 모양으로 생긴 두 과녁이 겹치는 부분이 존재하는지 안하는지는 두 점의 거리가 두 반지름의 합보다 작으면 Yes, 아니면 No