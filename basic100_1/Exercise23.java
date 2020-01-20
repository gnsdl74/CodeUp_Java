package edu.java.basic100_1;

import java.util.Scanner;

public class Exercise23 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("(범위 : -2147483647 ~ 2147483647)");
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		sc.close();
		
		System.out.println(-num);

	} // end main()

} // end Exercise23
