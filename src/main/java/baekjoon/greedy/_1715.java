package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;

public class _1715 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int length = Integer.parseInt(br.readLine());
		PriorityQueue<Long> queue = new PriorityQueue<>();
		long ans = 0;

		for (int i = 0; i < length; i++) {
			queue.add(Long.parseLong(br.readLine()));
		}
		while (queue.size() > 1) {
			long a = queue.poll();
			long b = queue.poll();
			ans += a + b;
			queue.add(a + b);
		}
		bw.write(String.valueOf(ans));
		bw.flush();
		bw.close();
	}
}
