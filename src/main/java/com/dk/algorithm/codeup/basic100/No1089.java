package com.dk.algorithm.codeup.basic100;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class No1089 {

	private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	private static StringTokenizer st;

	private static int getSpecificNumInSequence(int startNum, int sequence, int numCnt) {
		return startNum + sequence * (numCnt - 1);
	}

	private static void writeNumInBuffer(int num) throws IOException {
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
		int sequence = Integer.parseInt(st.nextToken());
		int numCnt = Integer.parseInt(st.nextToken());

		writeNumInBuffer(getSpecificNumInSequence(startNum, sequence, numCnt));
		flushBuffer();
	}
}
