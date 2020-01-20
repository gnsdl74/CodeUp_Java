package edu.java.basic100_2;

import java.util.Scanner;

public class Exercise55 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		boolean run = true;
		
		while(run) {
			int num1 = sc.nextInt();
			if(num1 != 0) {
				System.out.println(num1);
			} else {
				break;
			}
		} // end while
		sc.close();

	} // end main()

} // end Exercise55
