package edu.java.basic100_3;

import java.util.Scanner;

public class Exercise67 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("w, h, b 입력 : ");
		System.out.println("w, h는 정수, b는 40이하 4의 배수");
		int w = sc.nextInt();
		int h = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		double cal = Math.pow(2, 23);
		double mul = w*h*b;
		double result = mul/cal;
		
		System.out.println(String.format("%.2f MB", result));
	} // end main()

} // end Exercise67