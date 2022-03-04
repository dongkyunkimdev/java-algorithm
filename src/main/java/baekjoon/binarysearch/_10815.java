package baekjoon.binarysearch;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _10815 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		// init
		int n = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		int[] board = new int[m];
		for (int i = 0; i < m; i++) {
			board[i] = Integer.parseInt(st.nextToken());
		}

		for (int i = 0; i < m; i++) {
			bw.write(String.valueOf(binarySearch(board[i], arr, 0, n - 1)) + " ");
		}
		bw.flush();
		bw.close();
	}

	private static int binarySearch(int key, int[] arr, int start, int end) {
		int mid;
		while (start <= end) {
			mid = (start + end) / 2;
			if (key == arr[mid]) {
				return 1;
			} else if (key < arr[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}

		return 0;
	}
}
