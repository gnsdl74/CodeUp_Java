package edu.java.basic100_2;

import java.util.Scanner;

public class Exercise57 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num1 = sc.nextInt();
		while(num1 != 0) {
			num1--;
			System.out.println(num1);
		} // end while
		sc.close();

	} // end main()

} // end Exercise57
