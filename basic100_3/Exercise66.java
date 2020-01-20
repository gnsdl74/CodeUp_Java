package edu.java.basic100_3;

import java.util.Scanner;

public class Exercise66 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("h, b, c, s 입력 : ");
		int strength = sc.nextInt();
		int bit = sc.nextInt();
		int channel = sc.nextInt();
		int recording = sc.nextInt();
		sc.close();
		
		double cal = Math.pow(2, 23);
		double mul1 = strength * bit;
		double mul2 = channel * recording;
		// 각 변수를 모두 곱해서 변수에 저장하면 double의 범위를 넘어서 음수값을 반환
		// 그러므로 나눠서 계산
		double total = mul1 * mul2;
		double result = total/cal;
		
		System.out.println(String.format("%.1f MB", result));
	}	// end main()
	
}	// end Exercise66