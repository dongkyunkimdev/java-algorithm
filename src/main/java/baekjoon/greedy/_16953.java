package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _16953 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int ans = 0;

		while (a < b) {
			if (b % 10 == 1) {
				b /= 10;
				ans++;
			} else if (b % 2 == 0) {
				b /= 2;
				ans++;
			} else {
				break;
			}
		}
		if (a == b) bw.write(String.valueOf(ans + 1));
		else bw.write("-1");
		bw.flush();
		bw.close();
	}
}
