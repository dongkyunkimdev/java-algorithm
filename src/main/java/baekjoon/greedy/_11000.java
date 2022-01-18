package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class _11000 {

	static class Study implements Comparable<Study> {

		int start;
		int end;

		public Study(int start, int end) {
			this.start = start;
			this.end = end;
		}

		@Override
		public int compareTo(Study o) {
			if (this.start == o.start) {
				return this.end - o.end;
			}
			return this.start - o.start;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int cnt = Integer.parseInt(br.readLine());
		List<Study> list = new ArrayList<>();
		PriorityQueue<Integer> queue = new PriorityQueue<>();

		for (int i = 0; i < cnt; i++) {
			st = new StringTokenizer(br.readLine());
			list.add(new Study(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
		}
		Collections.sort(list);
		queue.add(list.get(0).end);
		for (int i = 1; i < list.size(); i++) {
			if (list.get(i).start >= queue.peek()) {
				queue.poll();
			}
			queue.add(list.get(i).end);
		}
		bw.write(String.valueOf(queue.size()));
		bw.flush();
		bw.close();
	}
}
