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

// �׽�Ʈ ���̽��� ��� ����ǰ� a�� b�� 0�϶� ����ȴٰ� �߱⶧���� while���� ���.