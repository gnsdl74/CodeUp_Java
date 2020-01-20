package edu.java.basic100_1;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("시, 분 입력 : ");
		String clock = sc.nextLine();
		String[] arr = clock.split(":");
		
		System.out.printf("%s:%s", arr[0], arr[1]);
		sc.close();
		
	}	// end main()

}	// end Exercise01
