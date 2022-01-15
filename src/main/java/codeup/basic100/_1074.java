package codeup.basic100;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class _1074 {

	private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	private static void printFactorial(int num) throws IOException {
		if (num > 0) {
			bw.write(String.valueOf(num));
			bw.newLine();
			printFactorial(num - 1);
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());

		printFactorial(num);

		bw.flush();
		bw.close();
	}
}
