package edu.java.basic100_2;

import java.util.Scanner;

public class Exercise38 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 2개 입력(0, 1) : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int result = 0;
		sc.close();

		if ((a == 1 && b == 0) || (a == 0 && b == 1)) {
			result = 1;
			System.out.println(result);
		} else {
			System.out.println(result);
		}

	} // end main()

} // end Exercise38