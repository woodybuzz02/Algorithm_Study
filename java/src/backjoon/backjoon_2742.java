package backjoon;

import java.util.Scanner;

public class backjoon_2742 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//		for(int i=1; i<=n; i++) {
//			System.out.println((1+n)-i);
//		}
		for(int i=n; i>0; i--) {
			System.out.println(i);
		}
	}

}

// for (�ʱ�ȭ��;  ���ǽ�; ������) {���๮;}
// �ʱ�ȭ�� : �ݺ��� ���� ���� ����, ���ǽ� : �������� �ݺ��ϴ°�, ������ : ��ŭ �����ϴ°� 