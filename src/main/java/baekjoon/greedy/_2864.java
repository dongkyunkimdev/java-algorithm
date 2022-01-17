package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _2864 {

	private static int getMin(StringBuilder sb, String a, int min) {
		for (int i = 0; i < a.length(); i++) {
			int n = Integer.parseInt(a.substring(i, i + 1));
			if(n == 6) sb.append(5);
			else sb.append(n);
		}
		min += Integer.parseInt(String.valueOf(sb));
		sb.setLength(0);
		return min;
	}

	private static int getMax(StringBuilder sb, String a, int max) {
		for (int i = 0; i < a.length(); i++) {
			int n = Integer.parseInt(a.substring(i, i + 1));
			if(n == 5) sb.append(6);
			else sb.append(n);
		}
		max += Integer.parseInt(String.valueOf(sb));
		sb.setLength(0);
		return max;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		String a = st.nextToken();
		String b = st.nextToken();
		int min = 0;
		int max = 0;

		min = getMin(sb, a, min);
		min = getMin(sb, b, min);
		max = getMax(sb, a, max);
		max = getMax(sb, b, max);
		bw.write(String.valueOf(min));
		bw.write(" ");
		bw.write(String.valueOf(max));
		bw.flush();
		bw.close();
	}
}
