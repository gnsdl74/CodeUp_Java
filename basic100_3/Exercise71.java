package edu.java.basic100_3;

import java.util.Scanner;

public class Exercise71 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("시작값, 곱할값, 곱할횟수 입력 : ");
		long start = sc.nextInt();
		long rate = sc.nextInt();
		long num = sc.nextInt();
		sc.close();
		
		for(long i=1; i<num; i++) {
			start *= rate;
		}
		System.out.println((long)start);
	} // end main()

} // end Exercise71