package edu.java.basic100_1;

import java.util.Scanner;

public class Exercise11 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.print("연월일 입력 : ");
		String date = sc.nextLine();
		sc.close();

		String[] arr = date.split("\\.");
		int[] arr2 = new int[arr.length];
		
		for(int i=0 ; i<arr.length ; i++) {
			arr2[i] = Integer.parseInt(arr[i]);
		}
		
		System.out.printf("%02d-%02d-%04d", arr2[2], arr2[1], arr2[0]);
		

	} // end main()

} // end Exercise11
