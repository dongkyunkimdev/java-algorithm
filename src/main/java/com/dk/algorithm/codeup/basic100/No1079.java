package com.dk.algorithm.codeup.basic100;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class No1079 {

	private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	private static StringTokenizer st;

	private static void printUntilQIsEntered() throws IOException {
		String str = st.nextToken();
		bw.write(str);
		bw.newLine();
		if (!"q".equals(str)) {
			printUntilQIsEntered();
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		st = new StringTokenizer(br.readLine());
		printUntilQIsEntered();

		bw.flush();
		bw.close();
	}
}
