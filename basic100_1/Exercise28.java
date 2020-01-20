package edu.java.basic100_1;

import java.util.Scanner;

public class Exercise28 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 2개 입력 : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();
		
		int sum = num1+num2;
		int sub = num1-num2;
		int mul = num1*num2;
		int div = num1/num2;
		int mod = num1%num2;
		double total = (double)num1/num2;
		
		System.out.println(sum);
		System.out.println(sub);
		System.out.println(mul);
		System.out.println(div);
		System.out.println(mod);
		System.out.println(String.format("%.2f", total));
	} // end main()

} // end Exercise28
