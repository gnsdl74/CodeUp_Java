package edu.java.basic100_3;

import java.util.Scanner;

public class Exercise62 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("주사위 2의 면을 입력하세요 : ");
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		for(int i=1 ; i<=n ; i++) {
			for(int j=1 ; j<=m ; j++) {
				System.out.print(i + " " + j);
				System.out.println();
			}
		} // end for()
		
		sc.close();
		
	}	// end main()
	
}	// end Exercise62
