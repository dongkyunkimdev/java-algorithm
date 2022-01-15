package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class _5585 {

	private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	private static final int PAY = 1000;

	private static int getMinChange(int pay, int price, int[] typeChange) {
		int change = pay - price;
		int result = 0;
		int arrStartIdx = 0;

		while (change != 0) {
			if (typeChange[arrStartIdx] <= change) {
				change -= typeChange[arrStartIdx];
				result++;
			} else arrStartIdx++;
		}

		return result;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] typeChange = {500, 100, 50, 10, 5, 1};
		int price = Integer.parseInt(br.readLine());
		bw.write(String.valueOf(getMinChange(PAY, price, typeChange)));
		bw.flush();
		bw.close();
	}
}
