package edu.java.basic100_3;

import java.util.Scanner;

public class Exercise63 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("16진수 : ");
		String x = sc.next();
		
		sc.close();
		
		int result = Integer.valueOf(x, 16);
		
		for(int i=1 ; i<16 ; i++) {
			System.out.printf("%X*%X=%X\n", result, i, result*i);
		}

	}	// end main()
	
}	// end Exercise63
