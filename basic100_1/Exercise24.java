package edu.java.basic100_1;

import java.util.Scanner;

public class Exercise24 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.print("영문자 입력 : ");
		char ch = sc.nextLine().charAt(0);
		sc.close();
		ch += 1;
		System.out.println(ch);

	} // end main()

} // end Exercise24
