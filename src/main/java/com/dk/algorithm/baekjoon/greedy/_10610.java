package com.dk.algorithm.baekjoon.greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class _10610 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = br.readLine();
		StringBuffer sb = new StringBuffer();
		int totalDigit = 0;
		int[] numBoard = new int[10];
		int cnt = 9;

		for (int i = 0; i < s.length(); i++) {
			int n = Integer.parseInt(s.substring(i, i + 1));
			totalDigit += n;
			numBoard[n]++;
		}
		if (!s.contains("0") || totalDigit % 3 != 0) {
			bw.write("-1");
			bw.flush();
			bw.close();
			return;
		}
		while (cnt >= 0) {
			if (numBoard[cnt] > 0) {
				sb.append(cnt);
				numBoard[cnt]--;
			} else {
				cnt--;
			}
		}
		bw.write(String.valueOf(sb));
		bw.flush();
		bw.close();
	}
}
