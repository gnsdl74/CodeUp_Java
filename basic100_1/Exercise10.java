package edu.java.basic100_1;

import java.util.Scanner;

public class Exercise10 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.print("시간 입력 : ");
		String date = sc.nextLine();
		sc.close();

		String[] arr = date.split(":");

		for (int i = 0; i < arr.length; i++) {
			String a = arr[i];
			if (i == 1) {
				int min = Integer.parseInt(a);
				System.out.printf("%d", min);
			}
		}

	} // end main()

} // end Exercise10
