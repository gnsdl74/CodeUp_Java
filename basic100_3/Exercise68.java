package edu.java.basic100_3;

import java.util.Scanner;

public class Exercise68 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		sc.close();
		int sum = 0;
		int i=0;
		while(sum < num) {
			i++;
			sum += i;
		}
		System.out.println(sum);
		
	} // end main()

} // end Exercise68