package edu.java.basic100_2;

import java.util.Scanner;

public class Exercise59 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		sc.close();
		
		int sum = 0;
		for (int i = 0; i <= num; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		} // end for
		System.out.println(sum);

	} // end main()

} // end Exercise59