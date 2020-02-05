package edu.java.basic100_3;

import java.util.Scanner;

public class Exercise80 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[10][10];

		for (int i = 0; i < 10; i++) {
			String Input = sc.nextLine();
			String[] InputSplit = Input.split(" ");
			for (int j = 0; j < 10; j++) {
				arr[i][j] = Integer.parseInt(InputSplit[j]);
			}
		} // end nested for1 (개미굴 입력)

		boolean run = true;
		int x = 1, y = 1;
		
		while (run) {
			if(arr[x][y] == 0) {
				arr[x][y] = 9;
			} else if(arr[x][y] == 2) {
				arr[x][y] = 9;
				break;
			}
			if (arr[x][y + 1] == 1) { // 오른쪽 : 1
				if (arr[x + 1][y] == 1) { // 오른쪽 : 1, 아래쪽 : 1
					break;
				} else { // 아래쪽 : 0 또는 2
					x++;
				}
			} else if (arr[x][y + 1] != 1) { // 오른쪽 : 0 또는 2
				y++;
			}
			if (arr[x][y] == 2) { // 도착
				run = false;
			}
			arr[x][y] = 9;
		} // end while (개미의 이동경로)
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		} // end nested for2 (개미굴 출력)

		sc.close();
	} // end main()

} // end Exercise80