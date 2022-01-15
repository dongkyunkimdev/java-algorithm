package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _1744 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int size = Integer.parseInt(br.readLine());
		List<Integer> minusZero = new ArrayList<>();
		List<Integer> plus = new ArrayList<>();
		int ans = 0;
		for (int i = 0; i < size; i++) {
			int n = Integer.parseInt(br.readLine());
			if (n > 0) plus.add(n);
			else minusZero.add(n);
		}

		Collections.sort(minusZero);
		plus.sort(Collections.reverseOrder());
		while (!minusZero.isEmpty() || !plus.isEmpty()) {
			if (minusZero.size() >= 2) {
				ans += minusZero.get(0) * minusZero.get(1);
				minusZero.remove(0);
				minusZero.remove(0);
			} else if (minusZero.size() == 1) {
				ans += minusZero.get(0);
				minusZero.remove(0);
			}

			if (plus.size() >= 2 && plus.get(1) != 1) {
				ans += plus.get(0) * plus.get(1);
				plus.remove(0);
				plus.remove(0);
			} else if (plus.size() >= 2) {
				ans += plus.get(0);
				plus.remove(0);
			} else if (plus.size() == 1) {
				ans += plus.get(0);
				plus.remove(0);
			}
		}
		bw.write(String.valueOf(ans));
		bw.flush();
		bw.close();
	}
}
