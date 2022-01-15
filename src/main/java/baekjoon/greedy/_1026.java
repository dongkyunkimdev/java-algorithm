package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _1026 {

	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	private static StringTokenizer st;
	private static final int ARR_START_IDX = 0;
	private static final int ARR_MIN_VAL = -1;
	private static final int ARR_MAX_VAL = 101;

	private static void setArr(int[] arr) throws IOException {
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
	}

	private static void rearrange(int[] a, int[] b) {
		int[] ascMaxValIdxB = new int[b.length];
		int[] ascMinValA = new int[a.length];
		int[] tempA = a.clone();
		int[] tempB = b.clone();
		setAscMaxValIdxB(tempB, ascMaxValIdxB, ARR_START_IDX);
		setAscMinValA(tempA, ascMinValA, ARR_START_IDX);
		for (int i = 0; i < ascMaxValIdxB.length; i++) {
			a[ascMaxValIdxB[i]] = ascMinValA[i];
		}
	}

	private static void setAscMaxValIdxB(int[] tempB, int[] ascMaxValIdxB, int tempIdx) {
		int maxVal = ARR_MIN_VAL;
		int maxIdx = ARR_START_IDX;
		for (int i = ARR_START_IDX; i < tempB.length; i++) {
			if (maxVal < tempB[i]) {
				maxVal = tempB[i];
				maxIdx = i;
			}
		}
		tempB[maxIdx] = ARR_MIN_VAL;
		ascMaxValIdxB[tempIdx] = maxIdx;
		if (tempIdx < ascMaxValIdxB.length - 1) setAscMaxValIdxB(tempB, ascMaxValIdxB, ++tempIdx);
	}

	private static void setAscMinValA(int[] tempA, int[] ascMinValA, int tempIdx) {
		int minVal = ARR_MAX_VAL;
		int minIdx = ARR_START_IDX;
		for (int i = 0; i < tempA.length; i++) {
			if (minVal > tempA[i]) {
				minVal = tempA[i];
				minIdx = i;
			}
		}
		tempA[minIdx] = ARR_MAX_VAL;
		ascMinValA[tempIdx] = minVal;
		if (tempIdx < ascMinValA.length - 1) setAscMinValA(tempA, ascMinValA, ++tempIdx);
	}

	private static void writeBuffer(int[] a, int[] b) throws IOException {
		int result = 0;
		for (int i = 0; i < a.length; i++) {
			result += a[i] * b[i];
		}
		bw.write(String.valueOf(result));
	}

	public static void main(String[] args) throws IOException {
		int length = Integer.parseInt(br.readLine());
		int[] A = new int[length];
		int[] B = new int[length];
		setArr(A);
		setArr(B);
		rearrange(A, B);
		writeBuffer(A, B);
		bw.flush();
		bw.close();
	}
}
