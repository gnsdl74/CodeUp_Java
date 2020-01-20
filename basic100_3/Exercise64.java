package edu.java.basic100_3;

import java.util.Scanner;

public class Exercise64 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("정수 1개 입력 : ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			if(i%3 == 0 ) {
				System.out.print("X ");
			} else {
				System.out.print(i + " ");
			}
		} // end for
		sc.close();

	} // end main()

} // end Exercise64
