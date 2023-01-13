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

// rumtimeError(NoSuchElement)가 났다. 계속 입력을 받는데 마지막에 더 이상 입력받을 줄이 없으면 에러를 띄우고 끝났기때문이다.
// for(int i=0;i<=T;i++) { 으로 해서 에러가 났고 for(int i=1;i<=T;i++) { 로 고쳤다.