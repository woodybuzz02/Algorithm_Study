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

// 백준에 제출시 class명을 Main으로 해야된다.
// Scanner은 java.util에 있는 라이브러리!
// Scanner 클래스를 호출후 선언 인자는 System.in
// 입력은 공백이나 줄로 구분한다.
// next + {자료형}()
// 우선 next()의 경우 공백문자를 받아들일 수가 없다
// Scanner.nextLine()의 경우 공백 문자와 상관없이 콘솔 창 한 줄(Line)에 있으면 모두 문자열로 인식해 String 변수로 리턴
// next()에서 a a라고 입력받았을 떄 버퍼에 버려진 문자열인 a가 남아있다. scan.nextLine으로 a가 넘어간다.
// 버퍼를 처리하지 않고 다시 입력을 받을려고 하니, 버퍼측에서는 이미 저장되어 있는 기존에 문자열을 입력도 받기전에 던져버리는 것
// nextLine() 전에 nextXXX와 같은 메서드를 사용했다면 반드시 버퍼를 비워주어야 한다.
// nextLine으로 변수에 담기 전에 nextLine 메서드만 호출해 버퍼를 비워주면 문제없이 다음 입력을 받을 수 있다. ex) sc.nextLine();
