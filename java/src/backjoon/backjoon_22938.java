package backjoon;

import java.io.IOException;
import java.util.Scanner;


public class backjoon_22938 {

	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int r1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		int r2 = sc.nextInt();
		double d = Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2));
		if (r1+r2 > d) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
	}
}

// �� ������� ���� �� ������ ��ġ�� �κ��� �����ϴ��� ���ϴ����� �� ���� �Ÿ��� �� �������� �պ��� ������ Yes, �ƴϸ� No