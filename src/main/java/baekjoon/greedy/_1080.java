package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _1080 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[][] a = new int[n][m];
		int[][] b = new int[n][m];
		int ans = 0;

		for (int i = 0; i < n; i++) {
			String s = br.readLine();
			for (int j = 0; j < m; j++) {
				a[i][j] = Integer.parseInt(s.substring(j, j + 1));
			}
		}
		for (int i = 0; i < n; i++) {
			String s = br.readLine();
			for (int j = 0; j < m; j++) {
				b[i][j] = Integer.parseInt(s.substring(j, j + 1));
			}
		}
		if (n < 3 || m < 3) {
			if(!isSame(a, b)) ans = -1;
		} else if (!isSame(a, b)) {
			for (int i = 0; i < n - 2; i++) {
				for (int j = 0; j < m - 2; j++) {
					if (a[i][j] != b[i][j]) {
						isFlip(a, i, j);
						ans++;
					}
					if(isSame(a, b)) break;
				}
				if(isSame(a, b)) break;
			}
			if(!isSame(a, b)) ans = -1;
		}

		bw.write(String.valueOf(ans));
		bw.flush();
		bw.close();
	}

	private static void isFlip(int[][] a, int n, int m) {
		for (int i = n; i < n + 3; i++) {
			for (int j = m; j < m + 3; j++) {
				if(a[i][j] == 0) a[i][j] = 1;
				else a[i][j] = 0;
			}
		}
	}

	private static boolean isSame(int[][] a, int[][] b) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if(a[i][j] != b[i][j]) return false;
			}
		}

		return true;
	}
}
