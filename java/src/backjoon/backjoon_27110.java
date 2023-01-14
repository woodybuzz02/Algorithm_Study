package backjoon;

import java.io.IOException;
import java.util.Scanner;


public class backjoon_27110 {

	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int f = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int answer = 0;
		if(f>=a){
			answer += a;
		}else{
			answer += f;
		}
		if(f>=b){
			answer += b;
		}else{
			answer += f;
		}
		if(f>=c){
			answer += c;
		}else{
			answer += f;
		}
		System.out.println(answer);
	}

}

