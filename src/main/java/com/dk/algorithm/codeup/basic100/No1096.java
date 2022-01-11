package com.dk.algorithm.codeup.basic100;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class No1096 {

	private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static StringTokenizer st;

	private static void writeXyOnCkboardByCnt(int cnt, int[][] ckboard) throws IOException {
		st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken()) - 1;
		int y = Integer.parseInt(st.nextToken()) - 1;
		ckboard[x][y] = 1;
		if (cnt > 1) {
			writeXyOnCkboardByCnt(--cnt, ckboard);
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
		int cnt = Integer.parseInt(br.readLine());

		writeXyOnCkboardByCnt(cnt, ckboard);
		printCkboard(ckboard);
		flushBuffer();
	}
}
