package edu.java.basic100_2;

import java.util.Scanner;

public class Exercise54 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num1 = sc.nextInt();
		int num2;
		for (int i = 0; i < num1; i++) {
			num2 = sc.nextInt();
			System.out.println(num2);
		} // end for
		sc.close();

	} // end main()

} // end Exercise54
