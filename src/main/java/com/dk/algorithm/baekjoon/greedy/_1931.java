package com.dk.algorithm.baekjoon.greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class _1931 {

	private static final int ARR_START_CNT = 0;
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	private static StringTokenizer st;
	private static int[][] times;

	private static void setTimes(int cnt, int arrCnt) throws IOException {
		st = new StringTokenizer(br.readLine());
		times[arrCnt][0] = Integer.parseInt(st.nextToken());
		times[arrCnt][1] = Integer.parseInt(st.nextToken());
		if (cnt > 1) {
			setTimes(--cnt, ++arrCnt);
		}
	}

	private static int getMaxCnt() {
		int cnt = 0;
		Stack<Integer> board = new Stack<>();

		for (int i = 0; i < times.length; i++) {
			if (board.isEmpty() || validTime(i, board)) {
				addBoard(i, board);
				cnt++;
			}
		}

		return cnt;
	}

	private static void addBoard(int idx, Stack<Integer> board) {
		for (int i = times[idx][0]; i <= times[idx][1]; i++) {
			board.push(i);
		}
	}

	private static boolean validTime(int idx, Stack<Integer> board) {
		return times[idx][0] >= board.peek();
	}

	public static void main(String[] args) throws IOException {
		int cnt = Integer.parseInt(br.readLine());
		times = new int[cnt][2];
		setTimes(cnt, ARR_START_CNT);
		Arrays.sort(times, (o1, o2) -> {
			if (o1[1] == o2[1]) {
				return o1[0] - o2[0];
			} else {
				return o1[1] - o2[1];
			}
		});
		bw.write(String.valueOf(getMaxCnt()));
		bw.flush();
		bw.close();
	}
}
