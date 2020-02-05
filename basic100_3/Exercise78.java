package edu.java.basic100_3;

import java.util.Scanner;

public class Exercise78 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] pan = new int[19][19];

//		for (int i = 0; i < pan.length; i++) {
//			for (int j = 0; j < pan[i].length; j++) {
//				if (i == 9 || i == 11 || j == 9 || j == 11) {
//					pan[i][j] = 1;
//					System.out.print(pan[i][j] + " ");
//				} else {
//					pan[i][j] = 0;
//					System.out.print(pan[i][j] + " ");
//				}
//
//			} // end nested for
//			System.out.println();
//		} // end for , 예시처럼 바둑판 초기화

		for (int i = 0; i < pan.length; i++) {
			for (int j = 0; j < pan[i].length; j++) {
				pan[i][j] = sc.nextInt();
			}
		}

		System.out.print("십자 뒤집기 횟수 : ");
		int num = sc.nextInt();
		int x = 0, y = 0;

		for (int n = 0; n < num; n++) {
			System.out.print("십자 뒤집기할 좌표 : ");
			x = sc.nextInt() - 1;
			y = sc.nextInt() - 1;

			for (int i = 0; i < pan.length; i++) {
				for (int j = 0; j < pan[i].length; j++) {
					if (i == x || j == y) {
						if (i == x && j == y) {
							pan[i][j] = pan[i][j];
						} else if (pan[i][j] == 0) {
							pan[i][j] = 1;
						} else {
							pan[i][j] = 0;
						}
					} // end if

				} // end nested for2
			} // end nested for1
		} // end for

		for (int i = 0; i < pan.length; i++) {
			for (int j = 0; j < pan[i].length; j++) {
				System.out.print(pan[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();
	} // end main()

} // end Exercise78