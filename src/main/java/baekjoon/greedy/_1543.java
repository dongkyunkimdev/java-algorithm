package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class _1543 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = br.readLine();
		String word = br.readLine();
		int ans = 0;

		for (int i = 0, j = 0; i < s.length() - word.length() + 1; i++) {
			if (word.equals(s.substring(i, i + word.length()))) {
				ans++;
				i += word.length() - 1;
			}
		}
		bw.write(String.valueOf(ans));
		bw.flush();
		bw.close();
	}
}
