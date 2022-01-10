package com.dk.algorithm.codeup.basic100;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class No1084 {

	private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	private static StringTokenizer st;
	private static final int REPEAT_START_NUM = 0;
	private static final int COUNT_NUM = 1;

	private static void repeatAllCase(int rNum, int gNum, int bNum, int r, int g,
		int b, int countNum) throws IOException {
		writeNumInBuffer(rNum, gNum, bNum);
		if (bNum < b - 1) {
			repeatAllCase(rNum, gNum, ++bNum, r, g, b, ++countNum);
			return;
		}
		if (gNum < g - 1) {
			repeatAllCase(rNum, ++gNum, REPEAT_START_NUM, r, g, b, ++countNum);
			return;
		}
		if (rNum < r - 1) {
			repeatAllCase(++rNum, REPEAT_START_NUM, REPEAT_START_NUM, r, g, b, ++countNum);
			return;
		}
		writeNumInBuffer(countNum);
	}

	private static void writeNumInBuffer(int rNum, int gNum, int bNum) throws IOException {
		bw.write(String.valueOf(rNum));
		bw.write(" ");
		bw.write(String.valueOf(gNum));
		bw.write(" ");
		bw.write(String.valueOf(bNum));
		bw.newLine();
	}

	private static void writeNumInBuffer(int countNum) throws IOException {
		bw.write(String.valueOf(countNum));
	}

	private static void flushBuffer() throws IOException {
		bw.flush();
		bw.close();
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		st = new StringTokenizer(br.readLine());
		int r = Integer.parseInt(st.nextToken());
		int g = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());

		repeatAllCase(REPEAT_START_NUM, REPEAT_START_NUM, REPEAT_START_NUM, r, g, b, COUNT_NUM);
		flushBuffer();
	}
}
