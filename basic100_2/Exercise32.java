package edu.java.basic100_2;

import java.util.Scanner;

public class Exercise32 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 2개 입력 : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();

		if(num1 > num2) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	} // end main()

} // end Exercise32