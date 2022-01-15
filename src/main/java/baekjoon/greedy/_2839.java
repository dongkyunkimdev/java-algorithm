package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class _2839 {

	private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

//	private static int getMinNumBags(int kg) {
//		if (kg % 5 == 0) {
//			return kg / 5;
//		}
//		// 5*n + 3*1인 경우(가장 최소의 경우)
//		if (kg % 5 == 3) {
//			return kg / 5 + 1;
//		}
//		// 5*n + 3*2인 경우(2번째 최소의 경우)
//		if (kg >= 6 && kg % 5 == 1) {
//			return kg / 5 + 1;
//		}
//		// 5*n + 3*3인 경우(3번째 최소의 경우)
//		if (kg >= 9 && kg % 5 == 4) {
//			return kg / 5 + 2;
//		}
//		// 5*n + 3*4인 경우(4번째 최소의 경우)
//		if (kg >= 12 && kg % 5 == 2) {
//			return kg / 5 + 2;
//		}
//
//		return -1;
//	}

	private static int getMinNumBags(int kg) {
		if (kg % 5 == 0) {
			return kg / 5;
		}
		for (int i = kg / 5; i >= 0; i--) {
			for (int j = 1; j < 5; j++) {
				if (i * 5 + 3 * j == kg) {
					return i + j;
				}
			}
		}

		return -1;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		bw.write(String.valueOf(getMinNumBags(Integer.parseInt(br.readLine()))));
		bw.flush();
		bw.close();
	}
}
