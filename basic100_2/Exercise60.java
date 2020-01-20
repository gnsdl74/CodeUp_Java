package edu.java.basic100_2;

import java.util.Scanner;

public class Exercise60 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("영문자 입력 : ");
		char ch = 0;
		while (ch != 'q') {
			ch = sc.next().charAt(0);
			System.out.println(ch);
		} // end while
		sc.close();

	} // end main()

} // end Exercise60