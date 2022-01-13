package com.dk.algorithm.baekjoon.greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class _2217 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int cnt = Integer.parseInt(br.readLine());
		int[] arr = new int[cnt];
		int[] result = new int[cnt];
		int temp = cnt;

		for (int i = 0; i < cnt; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr);
		for (int i = 0; i < cnt; i++) {
			result[i] = arr[i] * temp--;
		}
		bw.write(String.valueOf(Arrays.stream(result).max().orElseThrow(NoSuchElementException::new)));
		bw.flush();
		bw.close();
	}
}
