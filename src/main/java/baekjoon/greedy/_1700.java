package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class _1700 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int tapCnt = Integer.parseInt(st.nextToken());
		List<Integer> multiTap = new ArrayList<>();
		int useCnt = Integer.parseInt(st.nextToken());
		int[] arr = new int[useCnt];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < useCnt; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int ans = 0;

		for (int i = 0; i < tapCnt; i++) {
			multiTap.add(arr[i]);
		}
		for (int i = tapCnt; i < useCnt; i++) {
			if (multiTap.contains(arr[i])) {
			} else {
				int[] tool = new int[101];
				int lastUse = 0;
				for (int j = i; j < useCnt; j++) {
					tool[arr[j]]++;
					if (multiTap.contains(arr[j])) {
						lastUse = arr[j];
					}
				}
				int cnt = 0;
				for (int j = 0; j < multiTap.size(); j++) {
					if (tool[multiTap.get(j)] == 0) {
						multiTap.remove(j);
						ans++;
						multiTap.add(arr[i]);
						break;
					} else if (tool[multiTap.get(j)] > 0) {
						cnt++;
					}
				}
				for (int j = 0; j < multiTap.size(); j++) {
					if (multiTap.get(j) == lastUse) {
						lastUse = j;
						break;
					}
				}
				if (cnt == multiTap.size()) {
					multiTap.remove(lastUse);
					ans++;
					multiTap.add(arr[i]);
				}
			}
		}
		bw.write(String.valueOf(ans));
		bw.flush();
		bw.close();
	}
}
