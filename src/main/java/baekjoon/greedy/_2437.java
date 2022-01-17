package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _2437 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int cnt = Integer.parseInt(br.readLine());
		int[] arr = new int[cnt];
		int sum = 0;

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < cnt; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		for (int i = 0; i < cnt; i++) {
			if (sum + 1 < arr[i]) {
				break;
			}
			sum += arr[i];
		}
		bw.write(String.valueOf(sum + 1));
		bw.flush();
		bw.close();
	}
}
