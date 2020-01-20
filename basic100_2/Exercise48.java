package edu.java.basic100_2;

import java.util.Scanner;

public class Exercise48 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("세 정수 입력 : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		sc.close();
		
		if(a%2 == 0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}
		if(b%2 == 0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}
		if(c%2 == 0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}
		
		
		
		
	}	// end main()

}	// end IfExercise02
