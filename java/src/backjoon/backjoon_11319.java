package backjoon;

import java.io.*;
import java.util.*;

public class backjoon_11319 {
    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	int T = sc.nextInt();
    	for(int i=0;i<=T;i++) {
    		String input = sc.nextLine().trim().toLowerCase().replaceAll(" ","");
    		int mo = 0;
    		for(int j=0;j<input.length();j++){
    			if(input.charAt(j)=='a'||input.charAt(j)=='e'||input.charAt(j)=='i'||input.charAt(j)=='o'||input.charAt(j)=='u'){
    				mo++;
    			}
    		}
    		if(input.length()-mo!=0 || mo!=0){
    			System.out.println(input.length()-mo+" "+mo);
    		}
    		
    	}
    }
}

// trim() �Է¹��� ���� ������ �����ش�.
// toLowerCase() �ҹ��ڷ� ��ȯ toUpperCase() �빮�ڷ� ��ȯ
// replaceAll() �Լ��� ��� ���ڿ��� ���ϴ� ���� ������ ��ȯ�ϴ� �Լ�
// charAt() str�� charŸ������ ��ȯ�ϴ� ����  ( )�ȿ� ���ڰ� �� �� ���ڿ����� ������ ������ ��Ÿ���� ��
