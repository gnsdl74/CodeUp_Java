package edu.java.basic100_2;

import java.util.Scanner;

public class Exercise49 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		sc.close();
		
		if(num <= 0) {
			System.out.println("minus");
			if(num%2 == 0) {
				System.out.println("even");
			} else {
				System.out.println("odd");
			}
		} else {
			System.out.println("plus");
			if(num%2 == 0) {
				System.out.println("even");
			} else {
				System.out.println("odd");
			}
		}
		
	}	// end main()

}	// end IfExercise03
