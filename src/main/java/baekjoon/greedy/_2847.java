package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class _2847 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int cnt = Integer.parseInt(br.readLine());
		int[] arr = new int[cnt];
		int ans = 0;

		for (int i = 0; i < cnt; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		for (int i = cnt - 1; i > 0; i--) {
			while (arr[i] <= arr[i - 1]) {
				if (arr[i] <= arr[i - 1]) {
					arr[i - 1]--;
					ans++;
				}
			}
		}
		bw.write(String.valueOf(ans));
		bw.flush();
		bw.close();
	}
}
