package com.dk.algorithm.baekjoon.greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class _10162 {

	private static final int ARR_START_IDX = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] type = {300, 60, 10};
		int[] result = new int[type.length];
		int cookTime = Integer.parseInt(br.readLine());
		int idx = ARR_START_IDX;
		int flag = 0;

		while (idx < type.length) {
			if (cookTime < type[type.length - 1] && cookTime > 0) {
				flag = -1;
				break;
			}
			if (type[idx] <= cookTime) {
				cookTime -= type[idx];
				result[idx]++;
			} else {
				idx++;
			}
		}
		if (flag == -1) {
			bw.write(String.valueOf(flag));
		} else {
			for (int i : result) {
				bw.write(String.valueOf(i) + " ");
			}
		}
		bw.flush();
		bw.close();
	}
}
