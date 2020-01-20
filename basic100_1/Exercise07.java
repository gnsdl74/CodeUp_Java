package edu.java.basic100_1;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.print("실수 입력 : ");
		double dNum = sc.nextDouble();
		sc.close();
		
		String[] arr = String.valueOf(dNum).split("\\.");
		
			for(String a : arr) {
				System.out.println(a);
		}
	} // end main()

} // end Exercise07
