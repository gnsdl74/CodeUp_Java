package edu.java.basic100_2;

import java.util.Scanner;

public class Exercise50 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 입력 : ");
		int score = sc.nextInt();
		sc.close();

		if (score >= 90) {
			System.out.println("A");
		} else if (score >= 70) {
			System.out.println("B");
		} else if (score >= 40) {
			System.out.println("C");
		} else {
			System.out.println("D");
		}

	} // end main()

} // end IfExercise03
