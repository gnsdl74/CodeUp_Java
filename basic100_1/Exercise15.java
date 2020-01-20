package edu.java.basic100_1;

import java.util.Scanner;

public class Exercise15 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.print("10진수 입력 : ");
		int num = sc.nextInt();
		sc.close();
		
		System.out.printf("%x", num);
		
		
	} // end main()

} // end Exercise15
