package edu.java.basic100_1;

import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("주민번호 입력 : ");
		String num = sc.nextLine();
		String[] arr = num.split("-");
		sc.close();
		for(String a : arr) {
			System.out.print(a);
		}
		
	} // end main()

} // end Exercise04
