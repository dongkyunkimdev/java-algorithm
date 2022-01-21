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
		int startIdx = 0;

		for (int i = 0; i < useCnt; i++) {
			startIdx = i;
			if (multiTap.size() < tapCnt && !multiTap.contains(arr[i])) multiTap.add(arr[i]);
			if (multiTap.size() == tapCnt) break;
		}

		for (int i = startIdx + 1; i < useCnt; i++) {
			if (!multiTap.contains(arr[i])) {
				List<Integer> tempList = new ArrayList<>();
				for (int j = 0; j < tapCnt; j++) {
					for (int k = i + 1; k < useCnt; k++) {
						if (multiTap.contains(arr[k]) && !tempList.contains(arr[k])) {
							tempList.add(arr[k]);
							break;
						}
					}
				}
				if (tempList.size() == tapCnt) {
					multiTap.remove(tempList.get(tapCnt - 1));
					ans++;
					multiTap.add(arr[i]);
				} else {
					for (int j = 0; j < tapCnt; j++) {
						if (!tempList.contains(multiTap.get(j))) {
							multiTap.remove(j);
							ans++;
							multiTap.add(arr[i]);
							break;
						}
					}
				}
			}
		}
		bw.write(String.valueOf(ans));
		bw.flush();
		bw.close();
	}
}
