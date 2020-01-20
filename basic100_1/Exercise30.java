package edu.java.basic100_1;

import java.util.Scanner;

public class Exercise30 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 1개 입력 : ");
		int num1 = sc.nextInt();
		sc.close();
		
		num1 = num1 << 1;
		
		System.out.println(num1);
		
	} // end main()

} // end Exercise30
