package codeup.basic100;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _1081 {

	private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	private static StringTokenizer st;
	private static final int START_NUMBER = 1;

	private static void repeatAllCase(int firstNum, int secondNum, int firstDice, int secondDice)
		throws IOException {
		writeBuffer(firstNum, secondNum);
		if (secondNum < secondDice) {
			repeatAllCase(firstNum, ++secondNum, firstDice, secondDice);
			return;
		}
		if (firstNum < firstDice) {
			repeatAllCase(++firstNum, START_NUMBER, firstDice, secondDice);
			return;
		}
		printBuffer();
	}

	private static void writeBuffer(int firstNum, int secondNum) throws IOException {
		bw.write(String.valueOf(firstNum));
		bw.write(" ");
		bw.write(String.valueOf(secondNum));
		bw.newLine();
	}

	private static void printBuffer() throws IOException {
		bw.flush();
		bw.close();
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		st = new StringTokenizer(br.readLine());
		int firstDice = Integer.parseInt(st.nextToken());
		int secondDice = Integer.parseInt(st.nextToken());

		repeatAllCase(START_NUMBER, START_NUMBER, firstDice, secondDice);
	}
}
