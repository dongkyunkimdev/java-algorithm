package com.dk.algorithm.codeup.basic100;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class _1088 {

	private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	private static final int REPEAT_START_NUM = 1;

	private static void repeatFrom1ExcludeMultiplesOf3(int repeatNum, int num) throws IOException {
		if (repeatNum % 3 != 0) {
			writeNumInBuffer(repeatNum);
		}
		if (repeatNum < num) {
			repeatFrom1ExcludeMultiplesOf3(++repeatNum, num);
		}
	}

	private static void writeNumInBuffer(int num) throws IOException {
		bw.write(String.valueOf(num));
		bw.write(" ");
	}

	private static void flushBuffer() throws IOException {
		bw.flush();
		bw.close();
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());

		repeatFrom1ExcludeMultiplesOf3(REPEAT_START_NUM, num);
		flushBuffer();
	}
}
