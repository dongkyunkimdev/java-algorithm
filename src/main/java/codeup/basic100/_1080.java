package codeup.basic100;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class _1080 {

	private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	private static final int ADD_START_NUM = 1;
	private static int resultNum = 0;

	private static void printEqualOrGreaterThanInputNumber(int addNum, int num) throws IOException {
		resultNum += addNum;
		if (resultNum < num) {
			printEqualOrGreaterThanInputNumber(++addNum, num);
		} else {
			bw.write(String.valueOf(addNum));
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());

		printEqualOrGreaterThanInputNumber(ADD_START_NUM, num);

		bw.flush();
		bw.close();
	}
}
