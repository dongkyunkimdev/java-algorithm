package baekjoon.binarysearch;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _1654 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int cnt = Integer.parseInt(st.nextToken());
		int need = Integer.parseInt(st.nextToken());
		long max = 1;
		int[] arr = new int[cnt];
		for (int i = 0; i < cnt; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			if (max < arr[i]) {
				max = arr[i];
			}
		}

		bw.write(String.valueOf(binarySearch(arr, need, 1, max + 1)));
		bw.flush();
		bw.close();
	}

	private static int binarySearch(int[] arr, int need, long low, long high) {
		long sum;
		long mid;

		while (low < high) {
			sum = 0;
			mid = (low + high) / 2;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] / mid > 0) {
					sum += arr[i] / mid;
				}
			}

			if (sum < need) {
				high = mid;
			} else {
				low = mid + 1;
			}
		}

		return (int) (low - 1);
	}
}
