package com.dk.algorithm.baekjoon.greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class _1541 {

	private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	private static int getMinOperateNum(String[] arr) {
		int result = 0;
		int temp;

		for (int i = 0; i < arr.length; i++) {
			temp = 0;
			if (arr[i].contains("+")) {
				for (String s : arr[i].split("\\+")) {
					temp += Integer.parseInt(s);
				}
			} else {
				temp = Integer.parseInt(arr[i]);
			}
			if (i == 0) {
				result += temp;
			} else {
				result -= temp;
			}
		}

		return result;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = br.readLine().split("-");
		bw.write(String.valueOf(getMinOperateNum(arr)));
		bw.flush();
		bw.close();
	}
}
