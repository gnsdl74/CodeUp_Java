package edu.java.basic100_1;

import java.io.*;

public class Exercise06 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("br : ");
		String str = br.readLine();
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(str+"\n");
		bw.flush();
		bw.close();
	
	} // end main()

} // end Exercise06
