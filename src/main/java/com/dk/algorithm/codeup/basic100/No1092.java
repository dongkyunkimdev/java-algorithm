package com.dk.algorithm.codeup.basic100;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class No1092 {

	private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	private static StringTokenizer st;

	private static int getGcd(int pattern1, int pattern2) {
		if (pattern2 == 0) {
			return pattern1;
		}
		return getGcd(pattern2, pattern1 % pattern2);
	}

	private static int getLcm(int pattern1, int pattern2, int pattern3) {
		return getLcm(pattern3, getLcm(pattern1, pattern2));
	}

	private static int getLcm(int pattern1, int pattern2) {
		return pattern1 * pattern2 / getGcd(pattern1, pattern2);
	}

	private static void writeNumInBuffer(int lcm) throws IOException {
		bw.write(String.valueOf(lcm));
	}

	private static void flushBuffer() throws IOException {
		bw.flush();
		bw.close();
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		st = new StringTokenizer(br.readLine());
		int pattern1 = Integer.parseInt(st.nextToken());
		int pattern2 = Integer.parseInt(st.nextToken());
		int pattern3 = Integer.parseInt(st.nextToken());

		writeNumInBuffer(getLcm(pattern1, pattern2, pattern3));
		flushBuffer();
	}
}
