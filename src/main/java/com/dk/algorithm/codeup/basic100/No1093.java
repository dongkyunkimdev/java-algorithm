package com.dk.algorithm.codeup.basic100;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class No1093 {

	private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	private static StringTokenizer st;
	private static int[] attendanceNumber = new int[23];

	private static void addAttendanceNum() {
		attendanceNumber[Integer.parseInt(st.nextToken()) - 1]++;
		if (st.hasMoreTokens()) {
			addAttendanceNum();
		}
	}

	private static void writeArrInBuffer() throws IOException {
		for (int i : attendanceNumber) {
			bw.write(String.valueOf(i));
			bw.write(" ");
		}
	}

	private static void flushBuffer() throws IOException {
		bw.flush();
		bw.close();
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		st = new StringTokenizer(br.readLine());

		addAttendanceNum();
		writeArrInBuffer();
		flushBuffer();
	}
}
