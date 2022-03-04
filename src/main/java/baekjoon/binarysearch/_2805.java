package baekjoon.binarysearch;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _2805 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		// init
		st = new StringTokenizer(br.readLine());
		int treeCnt = Integer.parseInt(st.nextToken());
		int need = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int[] trees = new int[treeCnt];
		for (int i = 0; i < treeCnt; i++) {
			trees[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(trees);

		bw.write(String.valueOf(binarySearch(trees, need, 0, trees[treeCnt - 1])));
		bw.flush();
		bw.close();
	}

	private static int binarySearch(int[] trees, int need, int low, int high) {
		long sum;
		int mid;

		while (low < high) {
			sum = 0;
			mid = (low + high) / 2;

			for (int i = 0; i < trees.length; i++) {
				if (trees[i] > mid) {
					sum += trees[i] - mid;
				}
			}
			if (sum == need) {
				return mid;
			} else if (sum < need) {
				high = mid;
			} else {
				low = mid + 1;
			}
		}

		return low - 1;
	}
}
