package edu.java.basic100_2;

import java.util.Scanner;

public class Exercise35 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 1개 입력 : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();

		if(a != b) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
		
	} // end main()

} // end Exercise35