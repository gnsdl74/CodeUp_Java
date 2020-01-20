package edu.java.basic100_2;

import java.util.Scanner;

public class Exercise51 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("평가 입력 : ");
		char ch = sc.next().charAt(0);
		sc.close();

		switch (ch) {
		case 'A':
			System.out.println("best!!!");
			break;
		case 'B':
			System.out.println("good!!");
			break;
		case 'C':
			System.out.println("run!");
			break;
		case 'D':
			System.out.println("slowly~");
			break;
		default:
			System.out.println("what?");
			break;
		}

	} // end main()

} // end IfExercise03
