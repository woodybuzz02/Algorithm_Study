package backjoon;

import java.util.Scanner;

public class backjoon_1000 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		System.out.println(A+B);
	}

}

// ���ؿ� ����� class���� Main���� �ؾߵȴ�.
// Scanner�� java.util�� �ִ� ���̺귯��!
// Scanner Ŭ������ ȣ���� ���� ���ڴ� System.in
// �Է��� �����̳� �ٷ� �����Ѵ�.
// next + {�ڷ���}()
// �켱 next()�� ��� ���鹮�ڸ� �޾Ƶ��� ���� ����
// Scanner.nextLine()�� ��� ���� ���ڿ� ������� �ܼ� â �� ��(Line)�� ������ ��� ���ڿ��� �ν��� String ������ ����
// next()���� a a��� �Է¹޾��� �� ���ۿ� ������ ���ڿ��� a�� �����ִ�. scan.nextLine���� a�� �Ѿ��.
// ���۸� ó������ �ʰ� �ٽ� �Է��� �������� �ϴ�, ������������ �̹� ����Ǿ� �ִ� ������ ���ڿ��� �Էµ� �ޱ����� ���������� ��
// nextLine() ���� nextXXX�� ���� �޼��带 ����ߴٸ� �ݵ�� ���۸� ����־�� �Ѵ�.
// nextLine���� ������ ��� ���� nextLine �޼��常 ȣ���� ���۸� ����ָ� �������� ���� �Է��� ���� �� �ִ�. ex) sc.nextLine();
