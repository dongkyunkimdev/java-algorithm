package com.dk.algorithm.codeup.basic100;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class No1094 {

	private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	private static StringTokenizer st;
	private static Stack<Integer> attendanceNum = new Stack<>();

	private static void addAttendanceNum() {
		if (st.hasMoreTokens()) {
			attendanceNum.push(Integer.parseInt(st.nextToken()));
		}
		if (st.hasMoreTokens()) {
			addAttendanceNum();
		}
	}

	private static void writeStackInBuffer() throws IOException {
		if (!attendanceNum.isEmpty()) {
			bw.write(String.valueOf(attendanceNum.pop()));
			bw.write(" ");
		}
		if (!attendanceNum.isEmpty()) {
			writeStackInBuffer();
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
		writeStackInBuffer();
		flushBuffer();
	}
}
