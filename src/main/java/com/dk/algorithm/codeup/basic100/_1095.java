package com.dk.algorithm.codeup.basic100;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class _1095 {

	private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	private static StringTokenizer st;
	private static List<Integer> attendanceNum = new ArrayList<>();

	private static void addAttendanceNum() {
		if (st.hasMoreTokens()) {
			attendanceNum.add(Integer.parseInt(st.nextToken()));
		}
		if (st.hasMoreTokens()) {
			addAttendanceNum();
		}
	}

	private static void sortListAscending() {
		attendanceNum.sort(Comparator.naturalOrder());
	}

	private static void writeFirstElementInListToBuffer() throws IOException {
		bw.write(String.valueOf(attendanceNum.get(0)));
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
		sortListAscending();
		writeFirstElementInListToBuffer();
		flushBuffer();
	}
}
