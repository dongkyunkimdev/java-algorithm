package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _13305 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		long pay = 0;
		int minPrice = 1000000000;
		int length = Integer.parseInt(br.readLine());
		long[] road = new long[length - 1];
		long[] city = new long[length];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < length - 1; i++) {
			road[i] = Long.parseLong(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < length; i++) {
			city[i] = Long.parseLong(st.nextToken());
		}

		for (int i = 0; i < city.length - 1; i++) {
			if (city[i] < minPrice) {
				minPrice = (int) city[i];
			}
			pay += minPrice * road[i];
		}
		bw.write(String.valueOf(pay));
		bw.flush();
		bw.close();
	}
}
