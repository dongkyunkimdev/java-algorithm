package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _1049 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int line = Integer.parseInt(st.nextToken());
		int brandCnt = Integer.parseInt(st.nextToken());
		int[] pack = new int[brandCnt];
		int[] piece = new int[brandCnt];
		int ans = 0;

		for (int i = 0; i < brandCnt; i++) {
			st = new StringTokenizer(br.readLine());
			pack[i] = Integer.parseInt(st.nextToken());
			piece[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(pack);
		Arrays.sort(piece);
		if (piece[0] * 6 <= pack[0]) {
			ans = piece[0] * line;
		} else {
			int d = line / 6;
			int s = line % 6;
			ans += pack[0] * d;
			ans += Math.min(pack[0], piece[0] * s);
		}
		bw.write(String.valueOf(ans));
		bw.flush();
		bw.close();
	}
}
