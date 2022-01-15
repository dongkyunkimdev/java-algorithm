package codeup.basic100;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Locale;

public class _1082 {

	private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	private static final int GUGU_START_NUMBER = 1;
	private static final int GUGU_MAX_NUMBER = 15;

	private static void printMultiplicationTableByEnteredHex(int guguNum, String hex)
		throws IOException {
		if (guguNum <= GUGU_MAX_NUMBER) {
			bw.write(hex);
			bw.write("*");
			bw.write(Integer.toHexString(guguNum).toUpperCase(Locale.ROOT));
			bw.write("=");
			bw.write(Integer.toHexString(Integer.parseInt(hex, 16) * guguNum).toUpperCase(Locale.ROOT));
			bw.newLine();
			printMultiplicationTableByEnteredHex(guguNum + 1, hex);
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		printMultiplicationTableByEnteredHex(GUGU_START_NUMBER, br.readLine());

		flushBuffer();
	}

	private static void flushBuffer() throws IOException {
		bw.flush();
		bw.close();
	}
}
