package edu.java.basic100_2;

import java.util.Scanner;

public class Exercise41 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 1개 입력 : ");
		int a = sc.nextInt();
		sc.close();
		
		System.out.println(~a);

	} // end main()

} // end Exercise41