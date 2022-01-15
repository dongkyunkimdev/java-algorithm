package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class _1789 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		long n = Long.parseLong(br.readLine());
		int sequence = 1;
		int cnt = 0;
		while (sequence <= n) {
			n -= sequence;
			sequence++;
			cnt++;
		}
		bw.write(String.valueOf(cnt));
		bw.flush();
		bw.close();
	}
}
