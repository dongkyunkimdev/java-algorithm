package com.dk.algorithm.codeup.basic100;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class _1076 {

	private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	private static int alphabetAscii = 97;

	public static void printUntilAlphabet(int alphabet) throws IOException {
		if (alphabetAscii <= alphabet) {
			bw.write(String.valueOf((char)alphabetAscii));
			alphabetAscii++;
			bw.write(" ");
			printUntilAlphabet(alphabet);
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int alphabet = br.readLine().charAt(0);

		printUntilAlphabet(alphabet);

		bw.flush();
		bw.close();
	}
}
