package backjoon;

import java.io.*;
import java.util.*;

public class backjoon_11367 {
    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	int T = sc.nextInt();
    	for(int i=1;i<=T;i++) {
    		String name = sc.next();
    		int score = sc.nextInt();
    		if(97<=score){
    			System.out.println(name+" A+");
    		}else if(90<=score){
    			System.out.println(name+" A");
    		}else if(87<=score){
    			System.out.println(name+" B+");
    		}else if(80<=score){
    			System.out.println(name+" B");
    		}else if(77<=score){
    			System.out.println(name+" C+");
    		}else if(70<=score){
    			System.out.println(name+" C");
    		}else if(67<=score){
    			System.out.println(name+" D+");
    		}else if(60<=score){
    			System.out.println(name+" D");
    		}else{
    			System.out.println(name+" F");
    		}
    	}
    }
}

// rumtimeError(NoSuchElement)�� ����. ��� �Է��� �޴µ� �������� �� �̻� �Է¹��� ���� ������ ������ ���� �����⶧���̴�.
// for(int i=0;i<=T;i++) { ���� �ؼ� ������ ���� for(int i=1;i<=T;i++) { �� ���ƴ�.