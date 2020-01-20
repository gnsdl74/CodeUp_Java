package edu.java.basic100_1;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("연, 월, 일 입력 : ");
		String clock = sc.nextLine();
		String[] arr = clock.split("\\.");
		int[] arr2 = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			arr2[i] = Integer.parseInt(arr[i]);
		}

		System.out.printf("%04d.%02d.%02d", arr2[0], arr2[1], arr2[2]);
		sc.close();

	} // end main()

} // end Exercise01
