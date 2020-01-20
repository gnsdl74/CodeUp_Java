package edu.java.basic100_1;

import java.util.Scanner;

public class Exercise29 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 3개 입력 : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		sc.close();
		
		int sum = num1+num2+num3;
		double avg = (double)sum/3;
		
		
		System.out.println(sum);
		System.out.println(String.format("%.2f", avg));
		
	} // end main()

} // end Exercise29
