package edu.java.basic100_1;

import java.util.Scanner;

public class Exercise22 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("(범위 : -2147483648 ~ 2147483648)");
		System.out.println("첫 번째 정수 입력 : ");
		long num1 = sc.nextLong();
		long num2 = 0;
		if (num1 < -2147483648L || num1 > 2147483648L) {	
			// 2147483648 로만 작성했을때는 컴파일러에서 int형으로 해석
			// 그렇기때문에 끝에 'L'을 붙여줘서 Long 타입임을 선언해줘야 함
			System.out.println("범위 안의 정수를 입력하세요.");
		} else {
			System.out.println("두 번째 정수 입력 : ");
			num2 = sc.nextLong();
			if (num2 < -2147483648L || num2 > 2147483648L) {
				System.out.println("범위 안의 정수를 입력하세요.");

			} else {
				sc.close();

				long sum = num1 + num2;

				System.out.println(sum);
			}
		}
		

	} // end main()

} // end Exercise22
