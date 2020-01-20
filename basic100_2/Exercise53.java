package edu.java.basic100_2;

import java.util.Scanner;

public class Exercise53 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");

		int num;
		for (int i = 0;; i++) {
			num = sc.nextInt();

			if (num == 0) {
				break;
			} else {
				System.out.println(num);
			}
		} // end for
		sc.close();

	} // end main()

} // end Exercise53
