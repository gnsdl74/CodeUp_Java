package edu.java.basic100_2;

import java.util.Scanner;

public class Exercise43 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 2개 입력 : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		System.out.println(a|b);

	} // end main()

} // end Exercise43