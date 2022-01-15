package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class _1439 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = br.readLine();
		int val = -1;
		int[] arr = new int[2];

		for (int i = 0; i < s.length(); i++) {
			int n = Integer.parseInt(s.substring(i, i + 1));
			if (n != val) {
				arr[n]++;
				val = n;
			}
		}
		bw.write(String.valueOf(Arrays.stream(arr).min().orElseThrow(NoSuchElementException::new)));
		bw.flush();
		bw.close();
	}
}
