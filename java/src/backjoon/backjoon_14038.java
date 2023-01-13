package backjoon;

import java.io.*;
import java.util.*;

public class backjoon_14038 {
    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	int num = 0;
    	for(int i=1;i<=6;i++){
    		if(sc.next().charAt(0) == 'W'){
    			num++;
    		}
    	}
    	if(num>=5){
    		System.out.println(1);
    	}else if(num>=3) {
    		System.out.println(2);
    	}else if(num>=1) {
    		System.out.println(3);
    	}else {
    		System.out.println(-1);
    	}
    }
}

