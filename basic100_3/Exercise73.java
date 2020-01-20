package edu.java.basic100_3;

import java.util.Scanner;

public class Exercise73 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("세 사람의 방문주기 입력 : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		sc.close();
		int count=1;
		while(count%num1!=0 || count%num2 != 0 || count%num3!=0) { // num1, num2, num3 셋 모두 나머지가 0 일때 종료
			count++;
		} // end while
		System.out.println(count);

	} // end main()

} // end Exercise73