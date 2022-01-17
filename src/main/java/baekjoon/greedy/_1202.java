package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class _1202 {

	static class Jewelry implements Comparable<Jewelry> {

		int weight;
		int price;

		public Jewelry(int weight, int price) {
			this.weight = weight;
			this.price = price;
		}

		@Override
		public int compareTo(Jewelry o) {
			if (this.weight == o.weight) {
				return o.price - this.price;
			}
			return this.weight - o.weight;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int jewelryCnt = Integer.parseInt(st.nextToken());
		int bagCnt = Integer.parseInt(st.nextToken());
		List<Jewelry> list = new ArrayList<>();
		int[] bags = new int[bagCnt];
		PriorityQueue<Integer> price = new PriorityQueue<>(Collections.reverseOrder());
		long ans = 0;

		for (int i = 0; i < jewelryCnt; i++) {
			st = new StringTokenizer(br.readLine());
			list.add(
				new Jewelry(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
		}
		Collections.sort(list);
		for (int i = 0; i < bagCnt; i++) {
			bags[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(bags);
		for (int i = 0, j = 0; i < bagCnt; i++) {
			while (j < jewelryCnt && list.get(j).weight <= bags[i]) {
				price.add(list.get(j++).price);
			}
			if (!price.isEmpty()) {
				ans += price.poll();
			}
		}
		bw.write(String.valueOf(ans));
		bw.flush();
		bw.close();
	}
}
