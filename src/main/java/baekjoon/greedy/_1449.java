package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _1449 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int leakCnt = Integer.parseInt(st.nextToken());
		int tape = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int[] leak = new int[leakCnt];
		int distance = 1;
		int ans = 0;

		for (int i = 0; i < leakCnt; i++) {
			leak[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(leak);
		ans++;
		for (int i = 0; i < leakCnt - 1; i++) {
			distance += leak[i + 1] - leak[i];
			if (distance > tape) {
				ans++;
				distance = 1;
			}
		}
		bw.write(String.valueOf(ans));
		bw.flush();
		bw.close();
	}
}
