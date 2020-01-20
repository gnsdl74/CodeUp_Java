package edu.java.basic100_3;

import java.util.Scanner;

public class Exercise74 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("출석번호 부른 횟수 입력 : ");
		int num1 = sc.nextInt();
		int[] numArr = new int[num1];
		int[] printArr = new int[23];
		
		for(int i=0; i<numArr.length;i++) {
			System.out.print("무작위 번호 부르기 : ");
			numArr[i] = sc.nextInt();
		} // end for, 불린 번호들을 배열에 저장

		for (int i = 0; i < printArr.length; i++) {
			printArr[i] = 0;
		} // end for, printArr 배열 초기화
		
		for(int i=0 ; i<numArr.length; i++) {
			for(int j=1; j<=printArr.length; j++) {
				if(numArr[i] == j) {
					printArr[j-1]++;
				}
			}
		} // end for, 불린 횟수만큼 값 증가
		
		for (int i : printArr) {
			System.out.print(i + " ");
		} // end for, 배열 출력
		sc.close();

	} // end main()

} // end Exercise74