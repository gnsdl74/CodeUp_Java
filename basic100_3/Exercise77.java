package edu.java.basic100_3;

import java.util.*;

public class Exercise77 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("바둑판에 올려놓을 흰 돌 개수 : ");
		int num = sc.nextInt();
		int[][] arr = new int[19][19];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = 0;
			}
		}	// end for, 바둑판 0으로 초기화
		
		int coo;
		for(int i=0; i<num; i++) {
			System.out.print("바둑알이 올려진 좌표 : ");
			arr[coo= sc.nextInt()-1][coo= sc.nextInt()-1] = 1;
		} // end for, 흰 돌 올려놓기
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}	// end for, 바둑판 출력
		sc.close();

	} // end main()

} // end Exercise77