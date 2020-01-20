package edu.java.basic100_3;

import java.util.Scanner;

public class Exercise70 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int start = sc.nextInt();
		int rate = sc.nextInt();
		int num = sc.nextInt();
		int count = 1;
		sc.close();
		
		while(count != num) {
			start += rate;
			count++;
		}
		System.out.println(start);
		
	} // end main()

} // end Exercise70