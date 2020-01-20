package edu.java.basic100_3;

import java.util.Scanner;

public class Exercise75 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("출석번호 부른 횟수 입력 : ");
		int num1 = sc.nextInt();
		int[] array = new int[num1];

		for (int i = 0; i < array.length; i++) {
			System.out.print("출석 부른 번호 : ");
			array[i] = sc.nextInt();
		} // array 초기화
		
		for(int i=0; i<array.length/2; i++) {
			int temp = array[i];
			array[i] = array[array.length-1-i];
			array[array.length-1-i] = temp;
		} // array 정렬
		
		for(int i : array) {
			System.out.print(i + " ");
		} // array 출력

		sc.close();

	} // end main()

} // end Exercise75