package edu.java.basic100_3;

import java.util.Scanner;

public class Exercise79 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length = 0, direct = 0, x = 0, y = 0;

		System.out.print("세로 및 가로 입력 : ");
		int width = sc.nextInt();
		int height = sc.nextInt();
		int[][] arr = new int[width][height];

		for (int i = 0; i < width; i++) {
			for (int j = 0; j < height; j++) {
				arr[i][j] = 0;
				System.out.print(arr[i][j]);
			}
			System.out.println();
		} // 주어진 세로와 가로에 따라 격자판 초기화

		System.out.print("격자판에 놓을 막대의 수 : ");
		int Input = sc.nextInt(); // for문을 반복할 횟수
		for (int i = 0; i < Input; i++) {
			System.out.print("막대의 길이 : ");
			length = sc.nextInt();
			System.out.print("방향 : ");
			direct = sc.nextInt();
			System.out.print("x 좌표 , y 좌표: ");
			x = sc.nextInt();
			y = sc.nextInt();

			if (direct == 0) { // 막대의 방향이 가로일때
				for (int j = y - 1; j < y - 1 + length; j++) {
					arr[x - 1][j] = 1;
				}
			} else { // 막대의 방향이 세로일때
				for (int j = x - 1; j < x - 1 + length; j++) {
					arr[j][y - 1] = 1;
				}
			} // 입력된 정보대로 막대 놓기
			
		} // for문을 통해 추가적인 정보 입력

		for (int i = 0; i < width; i++) {
			for (int j = 0; j < height; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		} // 막대가 놓인 격자판 출력

		sc.close();
	} // end main()

} // end Exercise79