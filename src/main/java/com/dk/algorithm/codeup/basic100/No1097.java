package com.dk.algorithm.codeup.basic100;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class No1097 {

	private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static StringTokenizer st;
	private static final int ARR_START_NUM = 0;

	private static void write19x19Ckboard(int[][] ckboard, int arrLengthCnt) throws IOException {
		st = new StringTokenizer(br.readLine());
		for (int i = ARR_START_NUM; i < ckboard[arrLengthCnt].length; i++) {
			ckboard[arrLengthCnt][i] = Integer.parseInt(st.nextToken());
		}
		if (arrLengthCnt < ckboard[arrLengthCnt].length - 1) {
			write19x19Ckboard(ckboard, ++arrLengthCnt);
		}
	}

	private static void writeXyOnCkboardByCnt(int cnt, int[][] ckboard) throws IOException {
		st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken()) - 1;
		int y = Integer.parseInt(st.nextToken()) - 1;
		flipCross(x, y, ckboard);

		if (cnt > 1) {
			writeXyOnCkboardByCnt(--cnt, ckboard);
		}
	}

	private static void flipCross(int x, int y, int[][] ckboard) {
		xFlipCross(x, ckboard);
		yFlipCross(y, ckboard);
	}

	private static void xFlipCross(int x, int[][] ckboard) {
		for (int i = ARR_START_NUM; i < ckboard[x].length; i++) {
			if (ckboard[x][i] == 1) {
				ckboard[x][i] = 0;
			} else {
				ckboard[x][i] = 1;
			}
		}
	}

	private static void yFlipCross(int y, int[][] ckboard) {
		for (int i = ARR_START_NUM; i < ckboard[ARR_START_NUM].length; i++) {
			if (ckboard[i][y] == 1) {
				ckboard[i][y] = 0;
			} else {
				ckboard[i][y] = 1;
			}
		}
	}

	private static void printCkboard(int[][] ckboard) throws IOException {
		for (int[] innerArr : ckboard) {
			for (int i : innerArr) {
				bw.write(String.valueOf(i));
				bw.write(" ");
			}
			bw.newLine();
		}
	}

	private static void flushBuffer() throws IOException {
		bw.flush();
		bw.close();
	}

	public static void main(String[] args) throws IOException {
		int[][] ckboard = new int[19][19];
		write19x19Ckboard(ckboard, ARR_START_NUM);
		int cnt = Integer.parseInt(br.readLine());
		writeXyOnCkboardByCnt(cnt, ckboard);
		printCkboard(ckboard);
		flushBuffer();
	}
}
