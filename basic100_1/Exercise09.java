package edu.java.basic100_1;

import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		sc.close();

		int first = (num / 10000) * 10000;
		int second = (num - first) / 1000 * 1000;
		int third = (num - first - second) / 100 * 100;
		int fourth = (num - first - second - third) / 10 * 10;
		int fifth = (num - first - second - third - fourth);

		System.out.println("[" + first + "]");
		System.out.println("[" + second + "]");
		System.out.println("[" + third + "]");
		System.out.println("[" + fourth + "]");
		System.out.println("[" + fifth + "]");
	} // end main()

} // end Exercise09
