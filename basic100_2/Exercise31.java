package edu.java.basic100_2;

import java.util.Scanner;

public class Exercise31 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 2개 입력 : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();

		int total = num1 * (int) Math.pow(2, num2);
		System.out.println(total);

	} // end main()

} // end Exercise31