package com.dk.algorithm.codeup.basic100;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class No1077 {

	private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	private static final int ZERO = 0;

	private static void printUntilNumber(int repeatedNumber, int num) throws IOException {
		if (repeatedNumber <= num) {
			bw.write(String.valueOf(repeatedNumber));
			bw.newLine();
			printUntilNumber(++repeatedNumber, num);
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());

		printUntilNumber(ZERO, num);

		bw.flush();
		bw.close();
	}
}
