package backjoon;

import java.util.Scanner;

public class backjoon_1330 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		if (A>B) {
			System.out.println(">");
		} else if (A<B) {
			System.out.println("<");
		} else {
			System.out.println("==");
		}
		
	}

}

// ���ؿ� ����� class���� Main���� �ؾߵȴ�.
// Scanner�� java.util�� �ִ� ���̺귯��!
// Scanner Ŭ������ ȣ���� ���� ���ڴ� System.in
// �Է��� �����̳� �ٷ� �����Ѵ�.

