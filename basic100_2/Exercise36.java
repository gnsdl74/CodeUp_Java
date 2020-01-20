package edu.java.basic100_2;

import java.util.Scanner;

public class Exercise36 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 1개 입력(0, 1) : ");
		int a = sc.nextInt();
		sc.close();


		if (a == 0) {
			a = 1;
			System.out.println(a);
		} else {
			a = 0;
			System.out.println(a);
		}
		

	} // end main()

} // end Exercise36