package edu.java.basic100_1;

import java.util.Scanner;

public class Exercise08 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.print("단어 입력 : ");
		String word = sc.next();
		sc.close();

		char[] arr = new char[word.length()];
		for (int i = 0; i < word.length(); i++) {
			arr[i] = word.charAt(i);
		}
		for (char c : arr) {
			System.out.println("'" + c + "'");
		}

	} // end main()

} // end Exercise08
