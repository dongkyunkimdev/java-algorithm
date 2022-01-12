package com.dk.algorithm.codeup.basic100;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class No1099 {

	private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static StringTokenizer st;
	private static int[][] maze = new int[10][10];
	private static final int ARR_START_NUM = 0;
	private static final int START_X_VAL = 1;
	private static final int START_Y_VAL = 1;

	private static void setMaze(int cnt) throws IOException {
		st = new StringTokenizer(br.readLine());
		for (int i = ARR_START_NUM; i < maze[cnt].length; i++) {
			maze[cnt][i] = Integer.parseInt(st.nextToken());
		}
		if (cnt < maze.length - 1) setMaze(++cnt);
	}

	private static void findWayMaze(int x, int y) {
		if (maze[x][y] == 2) {
			maze[x][y] = 9;
			return;
		}
		maze[x][y] = 9;
		if (maze[x][y + 1] == 1) {
			findWayMaze(++x, y);
			return;
		}
		findWayMaze(x, ++y);
	}

	private static void writeBuffer() throws IOException {
		for (int[] innerArr : maze) {
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
		setMaze(ARR_START_NUM);
		findWayMaze(START_X_VAL, START_Y_VAL);
		writeBuffer();
		flushBuffer();
	}
}
