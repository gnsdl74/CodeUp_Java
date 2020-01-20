package edu.java.basic100_2;

import java.util.Scanner;

public class Exercise58 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("영문자 입력 : ");
		char ch = sc.nextLine().charAt(0);
		char first = 'a';
		do {
			System.out.println(first);
			first++;
		} while(first <= ch);
		// end do-while
		sc.close();

	} // end main()

} // end Exercise58
