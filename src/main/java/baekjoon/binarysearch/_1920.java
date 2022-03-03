package baekjoon.binarysearch;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _1920 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		int nLength = Integer.parseInt(br.readLine());
		int[] nArr = new int[nLength];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < nLength; i++) {
			nArr[i] = Integer.parseInt(st.nextToken());
		}
		int mLength = Integer.parseInt(br.readLine());
		int[] mArr = new int[mLength];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < mLength; i++) {
			mArr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(nArr);

		for (int i = 0; i < mLength; i++) {
			bw.write(String.valueOf(binarySearch(mArr[i], nArr, 0, nLength - 1)));
			bw.newLine();
		}

		bw.flush();
		bw.close();
	}

	private static int binarySearch(int key, int[] nArr, int low, int high) {
		int mid;

		while (low <= high) {
			mid = (low + high) / 2;

			if (key == nArr[mid]) {
				return 1;
			} else if (key < nArr[mid]) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}

		return 0;
	}
}
