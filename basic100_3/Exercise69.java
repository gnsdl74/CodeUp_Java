package edu.java.basic100_3;

import java.util.Scanner;

public class Exercise69 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		sc.close();
		
		for (int i = 0; i <= num; i++) {
			if (i % 3 == 0) {
				System.out.print("");
			} else {
				System.out.print(i + " ");
			}
		} // end for

	} // end main()

} // end Exercise69