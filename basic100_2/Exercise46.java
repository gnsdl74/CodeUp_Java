package edu.java.basic100_2;

import java.util.Scanner;

public class Exercise46 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 3개 입력 : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();

		int min = a > b ? (b > c ? c : b) : (a > c ? c : a);
		System.out.println(min);
		
	} // end main()

} // end Exercise46