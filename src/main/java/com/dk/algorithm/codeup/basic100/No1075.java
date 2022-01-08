package com.dk.algorithm.codeup.basic100;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class No1075 {

	private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	private static void printFactorialMinusOne(int num) throws IOException {
		num--;
		if (num >= 0) {
			bw.write(String.valueOf(num));
			bw.newLine();
			printFactorialMinusOne(num);
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());

		printFactorialMinusOne(num);

		bw.flush();
		bw.close();
	}
}
