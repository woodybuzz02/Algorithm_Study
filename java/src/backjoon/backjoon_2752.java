package backjoon;

import java.util.Arrays;
import java.util.Scanner;

public class backjoon_2752 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[3];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]); 
		}
		
		
	}

}

// Arrays.sort(); 오름차순 정렬