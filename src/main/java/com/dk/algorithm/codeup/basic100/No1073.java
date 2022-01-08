package com.dk.algorithm.codeup.basic100;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class No1073 {

	private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	private static void stopIfZeroEntered(String[] arr) throws IOException {
		for (String str : arr) {
			if (Integer.parseInt(str) == 0) {
				return;
			}
			bw.write(str);
			bw.newLine();
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = br.readLine().split(" ");

		stopIfZeroEntered(arr);
		bw.flush();
		bw.close();
	}
}
