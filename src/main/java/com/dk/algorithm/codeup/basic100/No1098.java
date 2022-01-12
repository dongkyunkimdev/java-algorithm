package com.dk.algorithm.codeup.basic100;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class No1098 {

	private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static StringTokenizer st;
	private static int[][] board;
	private static final int WIDTH = 0;
	private static final int HEIGHT = 1;

	private static void setBoard() throws IOException {
		st = new StringTokenizer(br.readLine());
		board = new int[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())];
	}

	private static void putStickOnBoard(int cnt) throws IOException {
		st = new StringTokenizer(br.readLine());
		int length = Integer.parseInt(st.nextToken());
		int direction = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());

		putStickOnBoard(length, direction, x, y);

		if (cnt > 1) {
			putStickOnBoard(--cnt);
		}
	}

	private static void putStickOnBoard(int length, int direction, int x, int y) {
		if (direction == WIDTH) {
			board[x - 1][y - 1] = 1;
			if (length > 1) {
				putStickOnBoard(--length, direction, x, ++y);
			}
		}
		if (direction == HEIGHT) {
			board[x - 1][y - 1] = 1;
			if (length > 1) {
				putStickOnBoard(--length, direction, ++x, y);
			}
		}
	}

	private static void writeBuffer() throws IOException {
		for (int[] innerArr : board) {
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
		setBoard();
		putStickOnBoard(Integer.parseInt(br.readLine()));
		writeBuffer();

		flushBuffer();
	}
}
