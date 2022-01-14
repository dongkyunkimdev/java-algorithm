package com.dk.algorithm.baekjoon.greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class _1946 {

	private static class Applicant implements Comparable<Applicant> {

		private int document;
		private int interview;

		public Applicant(int document, int interview) {
			this.document = document;
			this.interview = interview;
		}

		@Override
		public int compareTo(Applicant o) {
			if (this.document > o.document) {
				return 1;
			} else {
				return -1;
			}
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int applCnt = Integer.parseInt(br.readLine());
		List<Applicant> appl;
		List<Integer> answer = new ArrayList<>();

		for (int i = 0; i < applCnt; i++) {
			int cnt = Integer.parseInt(br.readLine());
			appl = new ArrayList<>();
			for (int j = 0; j < cnt; j++) {
				st = new StringTokenizer(br.readLine());
				appl.add(new Applicant(Integer.parseInt(st.nextToken()),
						Integer.parseInt(st.nextToken())));
			}
			Collections.sort(appl);
			int result = 1;
			int minInterview = appl.get(0).interview;
			for (int j = 1; j < appl.size(); j++) {
				if (appl.get(j).interview < minInterview) {
					result++;
					minInterview = appl.get(j).interview;
				}
			}
			answer.add(result);
		}
		for (Integer i : answer) {
			bw.write(String.valueOf(i));
			bw.newLine();
		}
		bw.flush();
		bw.close();
	}
}
