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

// �� ������� ���� �� ������ ��ġ�� �κ��� �����ϴ��� ���ϴ����� �� ���� �Ÿ��� �� �������� �պ��� ������ Yes, �ƴϸ� No