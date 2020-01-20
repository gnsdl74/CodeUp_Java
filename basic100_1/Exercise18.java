package edu.java.basic100_1;

import java.util.Scanner;

public class Exercise18 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.print("8진수 입력 : ");
		int num = sc.nextInt(16);	// nextInt(?) : ?이 공백이면 default로 10진수, 숫자를 넣으면 해당 숫자의 진법으로 연산 
		sc.close();
		
		System.out.printf("%o", num);
		
		
	} // end main()

} // end Exercise18
