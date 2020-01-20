package edu.java.basic100_2;

import java.util.Scanner;

public class Exercise52 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("월 입력 : ");
		int month = sc.nextInt();
		sc.close();

		switch (month) {
		case 12:
		case 1:
		case 2:
			System.out.println("winter");
			break;

		case 3:
		case 4:
		case 5:
			System.out.println("spring");
			break;

		case 6:
		case 7:
		case 8:
			System.out.println("summer");
			break;

		default:
			System.out.println("fall");
			break;
		}

	} // end main()

} // end IfExercise03
