package backjoon;

import java.util.Scanner;

public class backjoon_5217 {
	

	    public static void main(String[] args) {
	       Scanner sc = new Scanner(System.in); 
	       int T = sc.nextInt(); // �׽�Ʈ ���̽�
	       int sw = 0;
	       
	       for(int i=0; i<T ; i++) {
	           String temp="Pairs for ";
	           int n = sc.nextInt(); // 1���� ũ�ų� ���� 12���� �۰ų� ���� �ڿ��� n
	           System.out.print(temp+n+':'); // ���������� ���� "Pairs for"�� �ݺ����� ó���� ���          
	           for(int j=1;j<n;j++) {
	               for(int k=j+1;k<n;k++) {
	                   if(j<k && j!=k && j+k==n &&sw==0) {
	                       System.out.print(" "+j+" "+k);
	                       sw=1;} // �ΰ� �̻��϶��� ����ؾ��ϹǷ� ����ġ ������ �ϴ� sw�� �����ؼ� 2���̻��϶��� ���
	                   else if(j<k && j!=k && j+k==n && sw==1) {
	                           System.out.print(", "+j+" "+k);
	                           sw=1;  
	                   }
	               }
	           }
	           sw=0;
	           System.out.println();
	       }
	       
	}	
	
}


