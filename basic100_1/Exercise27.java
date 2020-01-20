package edu.java.basic100_1;

import java.util.Scanner;

public class Exercise27 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 1개 입력 : ");
		long num1 = sc.nextLong();
		num1++;
		sc.close();
		
		System.out.println(num1);
		
	} // end main()

} // end Exercise27
