package edu.java.basic100_3;

import java.util.Scanner;

public class Exercise72 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("시작값, 곱할값, 더할값, 몇번째 입력 : ");
		long start = sc.nextInt();
		long mul = sc.nextInt();
		long add = sc.nextInt();
		long num = sc.nextInt();
		sc.close();

		for (long i = 1; i < num; i++) {
			start = start * mul + add;
		} // end for
		System.out.println((long)start);

	} // end main()

} // end Exercise72