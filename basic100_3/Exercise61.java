package edu.java.basic100_3;

import java.util.Scanner;

public class Exercise61 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		int sum = 0, i = 0;
		while(sum < num) {
			i++;
			sum += i;
		} // end while
		System.out.println(i);
		sc.close();

	} // end main()

} // end Exercise61