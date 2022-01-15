package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _11047 {

	private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static StringTokenizer st;
	private static final int ARR_START_NUM = 0;

	private static int getMinCntCoin(int cnt, int money) throws IOException {
		int[] coinArr = new int[cnt];
		int tempMoney = money;
		int coinCnt = 0;
		setCoinArr(coinArr, cnt, ARR_START_NUM);
		for (int i = coinArr.length - 1; i >= 0; i--) {
			if (tempMoney == 0) break;
			if (tempMoney / coinArr[i] > 0) {
				coinCnt += tempMoney / coinArr[i];
				tempMoney -= coinArr[i] * (tempMoney / coinArr[i]);
			}
		}

		return coinCnt;
	}

	private static void setCoinArr(int[] coinArr, int cnt, int arrCnt) throws IOException {
		coinArr[arrCnt] = Integer.parseInt(br.readLine());
		if (cnt > 1) {
			setCoinArr(coinArr, --cnt, ++arrCnt);
		}
	}

	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		int cnt = Integer.parseInt(st.nextToken());
		int money = Integer.parseInt(st.nextToken());
		bw.write(String.valueOf(getMinCntCoin(cnt, money)));
		bw.flush();
		bw.close();
	}
}
