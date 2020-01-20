package edu.java.basic100_1;

import java.util.Scanner;

public class Exercise13 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.print("실수 입력 : ");
		double num = sc.nextDouble();
		sc.close();
		
		System.out.println(String.format("%.11f", num));
		
		
		
	} // end main()

} // end Exercise13
