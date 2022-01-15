package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _4796 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int cnt = 1;

		while (true) {
			String s = br.readLine();
			if ("0 0 0".equals(s)) break;
			int result = 0;
			st = new StringTokenizer(s);
			int L = Integer.parseInt(st.nextToken());
			int P = Integer.parseInt(st.nextToken());
			int V = Integer.parseInt(st.nextToken());

			result += V / P * L;
			result += Math.min(V % P, L);
			bw.write("Case " + cnt + ": " + result);
			bw.newLine();
			cnt++;
		}
		bw.flush();
		bw.close();
	}
}
