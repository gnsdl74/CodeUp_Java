package edu.java.basic100_3;

import java.util.Scanner;

public class Exercise65 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("빨강, 초록, 파랑 색 입력 : ");
		int r = sc.nextInt();
		int g = sc.nextInt();
		int b = sc.nextInt();
		int count = 0;
		
		for(int i=0; i<r ; i++) {
			for(int j=0 ; j<g ; j++) {
				for(int k=0; k<b ; k++) {
					System.out.printf("%d %d %d\n", i, j, k);
					count++;
				}
			}
		}	// end for()
		System.out.println(count);
		
		sc.close();
		
	}	// end main()
	
}	// end Exercise65