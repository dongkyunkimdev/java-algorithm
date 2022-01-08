package com.dk.algorithm.codeup.basic100;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class No1072 {

	private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	private static StringTokenizer st;

	private static void printEnteredNumberOfTimes() throws IOException {
		if (st.hasMoreTokens()) {
			bw.write(st.nextToken());
			bw.newLine();
			printEnteredNumberOfTimes();
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		br.readLine();
		st = new StringTokenizer(br.readLine());

		printEnteredNumberOfTimes();
		bw.flush();
		bw.close();
	}
}
