package edu.java.basic100_1;

import java.util.Scanner;

public class Exercise19 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.print("영문자 1개 입력 : ");
		char one = sc.nextLine().charAt(0); 
		sc.close();
		
		System.out.println((int)one);
		
	} // end main()

} // end Exercise19
