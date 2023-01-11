package backjoon;

import java.util.Scanner;

public class backjoon_4101 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(a > b) {
				System.out.println("Yes");
			} else if (a == 0 && b == 0){
				break;
			} else {
				System.out.println("No");
			}
		}
	}

}

// 테스트 케이스는 계속 진행되고 a와 b가 0일때 종료된다고 했기때문에 while문을 썼다.