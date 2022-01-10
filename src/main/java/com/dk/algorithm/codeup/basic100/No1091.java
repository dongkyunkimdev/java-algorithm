package com.dk.algorithm.codeup.basic100;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class No1091 {

	private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	private static StringTokenizer st;
	private static final int SEQUENCE_FIRST_NUM = 1;
	private static final int FINAL_NUM = 1;

	private static void repeatMultipleAddProgressionUntilCnt(long startNum, int multiplyNum,
		int addNum, int cnt) throws IOException {
		if (SEQUENCE_FIRST_NUM < cnt) {
			startNum = startNum * multiplyNum + addNum;
			repeatMultipleAddProgressionUntilCnt(startNum, multiplyNum, addNum, --cnt);
			return;
		}
		writeNumInBuffer(startNum);
	}

	private static void writeNumInBuffer(long num) throws IOException {
		bw.write(String.valueOf(num));
	}

	private static void flushBuffer() throws IOException {
		bw.flush();
		bw.close();
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		st = new StringTokenizer(br.readLine());
		int startNum = Integer.parseInt(st.nextToken());
		int multiplyNum = Integer.parseInt(st.nextToken());
		int addNum = Integer.parseInt(st.nextToken());
		int cnt = Integer.parseInt(st.nextToken());

		repeatMultipleAddProgressionUntilCnt(startNum, multiplyNum, addNum, cnt);
		flushBuffer();
	}
}
