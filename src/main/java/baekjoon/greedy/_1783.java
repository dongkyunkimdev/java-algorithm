package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _1783 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int ans = 1;

		if (n == 1) {
			ans = 1;
		} else if (n == 2) {
			if (m >= 9) {
				ans += 3;
			} else if (m < 9) {
				ans += (m - 1) / 2;
			}
		} else if (n >= 3) {
			if (m >= 7) {
				ans += m - 3;
			} else if (m < 5) {
				ans += m - 1;
			} else if (m < 7) {
				ans += 3;
			}
		}
		bw.write(String.valueOf(ans));
		bw.flush();
		bw.close();
	}
}
