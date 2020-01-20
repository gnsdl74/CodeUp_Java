package edu.java.basic100_3;

import java.util.*;

public class Exercise76 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("출석번호 부른 횟수 입력 : ");
		int num1 = sc.nextInt();
		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < num1; i++) {
			System.out.print("출석 부른 번호 : ");
			list.add(sc.nextInt());
		} // array 초기화
		sc.close();
		
		Collections.sort(list);
		
		System.out.println(list.get(0));

	} // end main()

} // end Exercise76