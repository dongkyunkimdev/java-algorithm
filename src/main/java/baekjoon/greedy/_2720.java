package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class _2720 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int cnt = Integer.parseInt(br.readLine());
		int[] arr = new int[cnt];
		int[][] ans = new int[cnt][4];

		for (int i = 0; i < cnt; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		for (int i = 0; i < cnt; i++) {
			int n = arr[i];
			ans[i][0] = n / 25;
			n %= 25;
			ans[i][1] = n / 10;
			n %= 10;
			ans[i][2] = n / 5;
			n %= 5;
			ans[i][3] = n;
		}
		for (int[] innerArr : ans) {
			for (int i : innerArr) {
				bw.write(i + " ");
			}
			bw.newLine();
		}
		bw.flush();
		bw.close();
	}
}
