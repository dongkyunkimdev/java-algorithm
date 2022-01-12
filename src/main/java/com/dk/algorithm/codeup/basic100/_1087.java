package com.dk.algorithm.codeup.basic100;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class _1087 {

	private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	private static final int REPEAT_START_NUM = 1;
	private static final int FINAL_NUM = 0;

	private static void repeatUntilGreaterOrEqual(int num, int finalNum, int sequence)
		throws IOException {
		if (finalNum < num) {
			repeatUntilGreaterOrEqual(num, finalNum + sequence, ++sequence);
			return;
		}
		writeFinalNumInBuffer(finalNum);
	}

	private static void writeFinalNumInBuffer(int compareNum) throws IOException {
		bw.write(String.valueOf(compareNum));
	}

	private static void flushBuffer() throws IOException {
		bw.flush();
		bw.close();
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());

		repeatUntilGreaterOrEqual(num, FINAL_NUM, REPEAT_START_NUM);
		flushBuffer();
	}
}
