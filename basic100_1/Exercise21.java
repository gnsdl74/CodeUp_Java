package edu.java.basic100_1;

import java.util.Scanner;

public class Exercise21 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("(범위 : -1073741824 ~ 1073741824)");
		System.out.println("첫 번째 정수 입력 : ");
		long num1 = sc.nextLong();
		long num2 = 0;
		if (num1 < -1073741824 || num1 > 1073741824) {
			System.out.println("범위 안의 정수를 입력하세요.");
		} else {
			System.out.println("두 번째 정수 입력 : ");
			num2 = sc.nextLong();
			if (num2 < -1073741824 || num2 > 1073741824) {
				System.out.println("범위 안의 정수를 입력하세요.");

			} else {
				sc.close();

				long sum = num1 + num2;

				System.out.println(sum);
			}
		}

	} // end main()

} // end Exercise21
